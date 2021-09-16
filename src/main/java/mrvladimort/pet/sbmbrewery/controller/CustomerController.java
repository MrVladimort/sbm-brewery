package mrvladimort.pet.sbmbrewery.controller;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmbrewery.model.CustomerDTO;
import mrvladimort.pet.sbmbrewery.model.CustomerDTO;
import mrvladimort.pet.sbmbrewery.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId) {
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody CustomerDTO CustomerDTO) {
        CustomerDTO savedDTO = customerService.saveNewCustomer(CustomerDTO);
        HttpHeaders headers = new HttpHeaders();
        // todo add hostname
        headers.add("Location", "/api/v1/customer/" + savedDTO.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Void> handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDTO CustomerDTO) {
        customerService.updateCustomer(customerId, CustomerDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID customerId) {
        customerService.deleteCustomer(customerId);
    }
}

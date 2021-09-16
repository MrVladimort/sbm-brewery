package mrvladimort.pet.sbmbrewery.service.impl;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmbrewery.model.CustomerDTO;
import mrvladimort.pet.sbmbrewery.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("name")
                .build();
    }
}

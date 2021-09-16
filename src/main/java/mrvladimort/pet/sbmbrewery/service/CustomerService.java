package mrvladimort.pet.sbmbrewery.service;

import mrvladimort.pet.sbmbrewery.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}

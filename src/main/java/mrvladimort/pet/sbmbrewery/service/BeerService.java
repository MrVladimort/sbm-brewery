package mrvladimort.pet.sbmbrewery.service;

import mrvladimort.pet.sbmbrewery.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}

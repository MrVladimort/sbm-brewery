package mrvladimort.pet.sbmbrewery.service;

import mrvladimort.pet.sbmbrewery.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteBeer(UUID beerId);
}

package mrvladimort.pet.sbmbrewery.service.v2;

import mrvladimort.pet.sbmbrewery.model.BeerDTO;
import mrvladimort.pet.sbmbrewery.model.v2.BeerDTOv2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDTOv2 getBeerById(UUID beerId);

    BeerDTOv2 saveNewBeer(BeerDTOv2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOv2 beerDTO);

    void deleteBeer(UUID beerId);
}

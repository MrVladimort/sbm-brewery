package mrvladimort.pet.sbmbrewery.service.v2.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mrvladimort.pet.sbmbrewery.model.enums.BeerStyleEnum;
import mrvladimort.pet.sbmbrewery.model.v2.BeerDTOv2;
import mrvladimort.pet.sbmbrewery.service.v2.BeerServiceV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDTOv2 getBeerById(UUID beerId) {
        return BeerDTOv2.builder()
                .id(UUID.randomUUID())
                .beerName("Name")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDTOv2 saveNewBeer(BeerDTOv2 beerDTO) {
        return BeerDTOv2.builder()
                .id(beerDTO.getId())
                .beerName(beerDTO.getBeerName())
                .beerStyle(beerDTO.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOv2 beerDTO) {
        // todo implement method
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}

package mrvladimort.pet.sbmbrewery.service.impl;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmbrewery.model.BeerDTO;
import mrvladimort.pet.sbmbrewery.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("Name")
                .beerStyle("style")
                .build();
    }
}

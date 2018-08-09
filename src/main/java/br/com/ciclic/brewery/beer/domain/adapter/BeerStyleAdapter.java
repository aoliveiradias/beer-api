package br.com.ciclic.brewery.beer.domain.adapter;

import br.com.ciclic.brewery.beer.application.transferobject.BeerStyleTransferObject;
import br.com.ciclic.brewery.beer.application.transferobject.TemperatureTransferObject;
import br.com.ciclic.brewery.beer.domain.entity.BeerStyle;

public class BeerStyleAdapter {

    private BeerStyleTransferObject to;
    private BeerStyle entity;

    public BeerStyleAdapter(BeerStyleTransferObject to) {
        this.to = to;
    }

    public BeerStyleAdapter(BeerStyle entity) {
        this.entity = entity;
    }

    public BeerStyle converterEntity() {
        String name = to.getName();
        Integer maximum = to.getTemperature().getMaximum();
        Integer minimum = to.getTemperature().getMinimum();

        return new BeerStyle(name, maximum, minimum);
    }

    public BeerStyleTransferObject converterTransferObject() {
        String name = entity.getName();
        Integer maximum = entity.getTemperature().getMaximum();
        Integer minimum = entity.getTemperature().getMinimum();

        return new BeerStyleTransferObject(name, new TemperatureTransferObject(maximum, minimum));
    }
}

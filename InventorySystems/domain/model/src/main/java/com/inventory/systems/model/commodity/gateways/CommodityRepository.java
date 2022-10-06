package com.inventory.systems.model.commodity.gateways;

import com.inventory.systems.model.commodity.Commodity;

import java.util.List;

public interface CommodityRepository {

    Commodity addCommodity(Commodity commodity);


    List<Commodity> getAllCommodity();

    String deleteCommodity(Long id);

    Commodity getCommodityById(Long id);

    Commodity getCommodityByname(String nane);

}

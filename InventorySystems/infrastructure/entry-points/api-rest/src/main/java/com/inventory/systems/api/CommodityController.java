package com.inventory.systems.api;

import com.inventory.systems.model.charges.Charges;
import com.inventory.systems.model.commodity.Commodity;
import com.inventory.systems.model.commodity.CommodityDeleteRequest;
import com.inventory.systems.usecase.charges.CommodityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commodity", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CommodityController {

    private final CommodityUseCase commodityUseCase;

    @PostMapping("addCommodity")
    public Commodity addCommodity (@RequestBody Commodity commodity){
        System.out.println(commodity.toString());
        return commodityUseCase.addCommodity(commodity); }

    @PostMapping("updateCommodity")
    public Commodity updateCommodity (@RequestBody Commodity commodity){ return commodityUseCase.addCommodity(commodity); }

    @DeleteMapping("deleteCommodity")
    public String deleteCommodity(@RequestBody CommodityDeleteRequest commodityDeleteRequest){ return commodityUseCase.deleteCommodity(commodityDeleteRequest); }

    @GetMapping("getAllCommodity")
    public List<Commodity> getAllCommodity(){ return commodityUseCase.getAllCommodity(); }
}

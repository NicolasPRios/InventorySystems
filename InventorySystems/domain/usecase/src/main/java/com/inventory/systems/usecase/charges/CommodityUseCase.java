package com.inventory.systems.usecase.charges;

import com.inventory.systems.model.commodity.Commodity;
import com.inventory.systems.model.commodity.CommodityDeleteRequest;
import com.inventory.systems.model.commodity.gateways.CommodityRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommodityUseCase {

    private final CommodityRepository commodityRepository;

    public Commodity addCommodity(Commodity commodity) {
        Commodity response = new Commodity();
        if(commodity != null && commodity.getId() != null) {
            Commodity commodity1  = commodityRepository.getCommodityById(commodity.getId());
            if (commodity1 !=null && commodityRepository.getCommodityByname(commodity.getProductName()).getId() == commodity.getId() ) {
                response = commodityRepository.addCommodity(commodity);
            }
        }else{
            if (commodityRepository.getCommodityByname(commodity.getProductName()) == null) {
                response = commodityRepository.addCommodity(commodity);
            }
        }
        return  response;
    }

    public String deleteCommodity(CommodityDeleteRequest commodityDeleteRequest){
        Commodity commodity = commodityRepository.getCommodityById(commodityDeleteRequest.getId());
        if(commodityDeleteRequest.getIdUser()== commodity.getUser().getId()){
            return commodityRepository.deleteCommodity(commodityDeleteRequest.getId());
        }
        return "No se puede eliminar ya que no es el mismo usuario que registro la mercancia";
    }

    public List<Commodity> getAllCommodity(){
        return commodityRepository.getAllCommodity();
    }
}

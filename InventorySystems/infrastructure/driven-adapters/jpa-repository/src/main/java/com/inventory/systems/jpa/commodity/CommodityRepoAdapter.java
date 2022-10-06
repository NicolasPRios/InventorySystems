package com.inventory.systems.jpa.commodity;

import com.inventory.systems.jpa.helper.AdapterOperations;
import com.inventory.systems.model.commodity.Commodity;
import com.inventory.systems.model.commodity.gateways.CommodityRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommodityRepoAdapter extends AdapterOperations<Commodity, CommodityData, Long, CommodityRepo>
implements CommodityRepository {


    public CommodityRepoAdapter(CommodityRepo repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d,Commodity.class));
    }

    @Override
    public Commodity addCommodity(Commodity commodity) {
        return super.save(commodity);
    }


    @Override
    public List<Commodity> getAllCommodity() {
        return super.findAll();
    }

    @Override
    public String deleteCommodity(Long id) {
        Commodity commodity = super.findById(id);
        if(commodity!= null) {
            repository.deleteById(commodity.getId());
            return "Se elimino correctamente";
        }
        return "No se encontro la entidad";
    }

    @Override
    public Commodity getCommodityById(Long id) {
        return super.findById(id);
    }

    @Override
    public Commodity getCommodityByname(String name) {
        return super.toEntity(repository.getCommodityByname(name));
    }


}

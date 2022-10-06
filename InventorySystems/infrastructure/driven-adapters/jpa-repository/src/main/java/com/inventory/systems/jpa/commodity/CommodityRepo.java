package com.inventory.systems.jpa.commodity;

import com.inventory.systems.model.commodity.Commodity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface CommodityRepo extends CrudRepository<CommodityData, Long>, QueryByExampleExecutor<CommodityData> {

    @Query("SELECT  co  FROM CommodityData co WHERE  co.productName=  :name")
    CommodityData getCommodityByname(@Param("name") String name);
}

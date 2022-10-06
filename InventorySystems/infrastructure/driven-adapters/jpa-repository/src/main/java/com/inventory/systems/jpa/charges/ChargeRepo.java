package com.inventory.systems.jpa.charges;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ChargeRepo extends CrudRepository<ChargesData/* change for adapter model */, Long>, QueryByExampleExecutor<ChargesData/* change for adapter model */> {
}

package com.inventory.systems.jpa.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserRepo extends CrudRepository<UserData,Long>, QueryByExampleExecutor<UserData> {
}

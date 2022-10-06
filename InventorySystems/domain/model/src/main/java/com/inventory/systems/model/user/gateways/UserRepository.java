package com.inventory.systems.model.user.gateways;

import com.inventory.systems.model.user.User;

public interface UserRepository {
    User getUserById(Long name);

    User addUser(User user);
}

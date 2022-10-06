package com.inventory.systems.jpa.user;

import com.inventory.systems.jpa.helper.AdapterOperations;
import com.inventory.systems.model.user.User;
import com.inventory.systems.model.user.gateways.UserRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoAdapter extends AdapterOperations< User, UserData, Long, UserRepo>
implements UserRepository {

    public UserRepoAdapter(UserRepo repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.map(d, User.class));
    }

    @Override
    public User getUserById(Long name) {
        return super.findById(name);
    }

    @Override
    public User addUser(User user) {
        return super.save(user);
    }
}

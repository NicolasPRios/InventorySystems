package com.inventory.systems.usecase.charges;

import com.inventory.systems.model.charges.Charges;
import com.inventory.systems.model.charges.gateways.ChargesRepository;
import com.inventory.systems.model.user.User;
import com.inventory.systems.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase {

    private final UserRepository userRepository;

    private final ChargesRepository chargesRepository;


    public User addUser(User user){
        Charges charges = chargesRepository.getChargesById(user.getUserCharge().getId());
        System.out.print(charges.toString());
        User user1 = new User();
        if(charges != null){
           user1 = userRepository.addUser(user);
        }else{ System.out.println("Excepcion cargo no existente"); }
        return user1;
    }
}

package com.inventory.systems.usecase.charges;

import com.inventory.systems.model.charges.Charges;
import com.inventory.systems.model.charges.gateways.ChargesRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ChargesUseCase {
    private final ChargesRepository chargesRepository;

    public List<Charges> getAllCharges(){ return chargesRepository.getAllCharges(); }

    public Charges addCharges(Charges charges){ return chargesRepository.addCharges(charges);}
}

package com.inventory.systems.model.charges.gateways;

import com.inventory.systems.model.charges.Charges;

import java.util.List;

public interface ChargesRepository {
    List<Charges> getAllCharges();

    Charges addCharges(Charges charges);

    Charges getChargesById(Long idCharge);
}

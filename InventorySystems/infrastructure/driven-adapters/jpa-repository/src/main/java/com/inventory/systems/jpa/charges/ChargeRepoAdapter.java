package com.inventory.systems.jpa.charges;

import com.inventory.systems.jpa.helper.AdapterOperations;
import com.inventory.systems.model.charges.Charges;
import com.inventory.systems.model.charges.gateways.ChargesRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChargeRepoAdapter extends AdapterOperations<Charges/* change for domain model */, ChargesData/* change for adapter model */, Long, ChargeRepo>
implements ChargesRepository
{
    public ChargeRepoAdapter(ChargeRepo repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Charges.class/* change for domain model */));
    }

    @Override
    public List<Charges> getAllCharges() {
        return super.toList(repository.findAll());
    }

    @Override
    public Charges addCharges(Charges charges) {
        return super.save(charges);
    }

    @Override
    public Charges getChargesById(Long idCharge) {
        return super.findById(idCharge);
    }
}

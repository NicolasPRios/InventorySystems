package com.inventory.systems.api;

import com.inventory.systems.model.charges.Charges;
import com.inventory.systems.usecase.charges.ChargesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping(value = "/charges", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ChargesController {
    private final ChargesUseCase chargesUseCase;

    @GetMapping("getAllCharges")
    public List<Charges> getAllCharges(){ return chargesUseCase.getAllCharges(); }

    @PostMapping("addCharges")
    public Charges addCharges(@RequestBody Charges charges){ return chargesUseCase.addCharges(charges);
    }
}

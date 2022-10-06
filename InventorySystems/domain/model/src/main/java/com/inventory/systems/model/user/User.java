package com.inventory.systems.model.user;
import com.inventory.systems.model.charges.Charges;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User implements Serializable {
    private Long id;
    private String name;
    private int age;
    private Charges userCharge;
    private String admissionDate;
}

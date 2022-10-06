package com.inventory.systems.model.commodity;
import com.inventory.systems.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Commodity {
    private Long id;
    private String productName;
    private int amount;
    private String entryDate;
    private User user;
    private String updateDate;
    private User userUpdate;

}

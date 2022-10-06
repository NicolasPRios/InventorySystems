package com.inventory.systems.jpa.commodity;

import com.inventory.systems.jpa.user.UserData;
import com.inventory.systems.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "commodity")
public class CommodityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "productname")
    private String productName;
    @Column(name = "amount")
    private int amount;
    @Column(name = "entrydate")
    private String entryDate;
    @JoinColumn(name = "username")
    @ManyToOne
    private UserData user;
    @Column(name = "updateDate")
    private String updateDate;
    @JoinColumn(name = "userupdate")
    @ManyToOne
    private UserData userUpdate;
}

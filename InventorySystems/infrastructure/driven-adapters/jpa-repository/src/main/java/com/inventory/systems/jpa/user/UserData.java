package com.inventory.systems.jpa.user;

import com.inventory.systems.jpa.charges.ChargesData;
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
@Table(name = "userdata")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @JoinColumn(name = "usercharge")
    @ManyToOne
    private ChargesData userCharge;
    @Column(name = "admissiondate")
    private String admissionDate;
}

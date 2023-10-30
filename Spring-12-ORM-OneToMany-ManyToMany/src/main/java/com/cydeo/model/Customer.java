package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customers")
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String userName;
    private  String name;
    private String surName;
    private  String email;
    private String address;

    public Customer(String userName, String name, String surName, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }



    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)  //in onetomany relationship,ownership belongs to Many side
    private List<Payment> paymentList;
}

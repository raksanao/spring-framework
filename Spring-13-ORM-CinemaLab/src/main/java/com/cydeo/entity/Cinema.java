package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
public class Cinema extends BaseEntity{
    private  String name;
    private  String SponsoredName;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Location location;

}

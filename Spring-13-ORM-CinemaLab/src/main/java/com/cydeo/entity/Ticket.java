package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Ticket extends BaseEntity {
    private  Integer seatNumber;
    private  Integer rowNumber;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate dateTime;
   @ManyToOne(fetch = FetchType.LAZY)
    private  MovieCinema movieCinema;
    @ManyToOne(fetch = FetchType.LAZY)
    private  User userAccount;


}

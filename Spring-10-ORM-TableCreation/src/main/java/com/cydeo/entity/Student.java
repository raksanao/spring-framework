package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="studentFirstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    private String email;
@Transient
    protected String city;
@Column(columnDefinition = "Time")
private LocalTime birthTime;
@Column(columnDefinition = "Date")
    private LocalDate birthDate;
@Column(columnDefinition = "TimeStamp")
    private LocalTime birthDateTime;

@Enumerated(EnumType.STRING)
private Gender gender;



}

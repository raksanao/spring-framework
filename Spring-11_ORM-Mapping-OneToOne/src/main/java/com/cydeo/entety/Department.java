package com.cydeo.entety;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity// we want to create table from it
@Table(name = "departments")
@Data
@NoArgsConstructor

public class Department extends  BaseEntity{//baseEntity for common field in both table
    private String department;
    private String division;
    @OneToOne(mappedBy = "department_id")
    private  Employee employee;
    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}

package com.cydeo.service;

import com.cydeo.model.Employee;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.stereotype.Component;

@Component

public class SalaryService {
    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository, HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        //hourllyRate * Regular hours
        System.out.println(employeeRepository.getHourlyRate()*hoursRepository.getHours());

    }
}

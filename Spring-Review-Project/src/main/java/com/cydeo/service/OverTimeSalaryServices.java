package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class OverTimeSalaryServices {
    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public OverTimeSalaryServices(EmployeeRepository employeeRepository,@Qualifier("overtimeHours") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }
    public void calculateOverTimeSalary(){
        System.out.println(hoursRepository.getHours()*employeeRepository.getHourlyRate());
    }
}

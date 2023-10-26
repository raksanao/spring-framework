package com.cydeo.bootstrap;

import com.cydeo.entety.Department;
import com.cydeo.entety.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component

public class DataGenerator implements CommandLineRunner {
    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee>employeeList=new ArrayList<>();
        List<Department>departmentList=new ArrayList<>();

        Employee e1= new Employee("Berrie", "Manueau","bmanue@dion.ne.jp", LocalDate.of(2006,04,20),3000,Gender.F);
        Employee e2= new Employee("Ariel", "McNee","amc@gmail.com", LocalDate.of(2009,4,11),2000,Gender.M);
        Employee e3= new Employee("Sydney", "Symond","symund@gmail.com", LocalDate.of(2010,04,12),5000,Gender.F);
        Employee e4= new Employee("Avron", "Rowants",null, LocalDate.of(2006,04,2),1000,Gender.F);
        Employee e5= new Employee("Feliks", "Morfie","fmort@gmail.com", LocalDate.of(2014,04,3),6000,Gender.M);


        Department d1=new Department("Sports","Outdoors");
        Department d2=new Department("Tools","Hardwar");
        Department d3=new Department("Clothes","Home");
        Department d4=new Department("Computer","Electronic");
        Department d5=new Department("Phones","Electronic");
   employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
   departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

   employeeRepository.saveAll(employeeList);
   departmentRepository.saveAll(departmentList);

    }
}

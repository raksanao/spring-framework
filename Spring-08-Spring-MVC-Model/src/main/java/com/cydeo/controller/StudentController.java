package com.cydeo.controller;

import com.cydeo.model.Student;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller

public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

      model.addAttribute("name","Cydeo") ;
      model.addAttribute("course","MVC") ;
      String subject="Collection";
      model.addAttribute("subject",subject);

   int studetId=new Random().nextInt();
      model.addAttribute("Id",studetId);

      List<Integer> numbers=new ArrayList<>();
      numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

model.addAttribute("numbers",numbers);
Student student =new Student(1,"Mike","Smith");
model.addAttribute("student",student);

        return "/student/welcome";




    }


    }

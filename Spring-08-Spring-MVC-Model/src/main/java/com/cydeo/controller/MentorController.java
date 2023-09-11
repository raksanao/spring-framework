package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model) {

         List<Mentor> mentorList=new ArrayList<>();
mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanka",45, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryn",25, Gender.FEMALE));
     model.addAttribute("mentor",mentorList);

        return "mentor/mentor";
    }
}
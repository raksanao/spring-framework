package com.cydeo.stereotype_annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class DataStructure {
    ExtraHours extraHours;


    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }





    public void  getTotalHours(){
    System.out.println("Total hours : "+ 20+(20+extraHours.getHour()));





}
}

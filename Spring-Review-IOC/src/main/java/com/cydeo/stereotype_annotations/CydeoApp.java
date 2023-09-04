package com.cydeo.stereotype_annotations;

import com.cydeo.stereotype_annotations.Config.ConfigCourse;
import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.ExtraHours;
import com.cydeo.stereotype_annotations.model.Microservices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
            ApplicationContext container =
                     new AnnotationConfigApplicationContext(ConfigCourse.class);


     container.getBean(DataStructure.class).getTotalHours();
   container.getBean(Microservices.class).getTotalHours();

   Microservices ms=container.getBean(Microservices.class);
   ms.getTotalHours();


        ExtraHours ex=container.getBean(ExtraHours.class);
        System.out.println(ex);
    }



}

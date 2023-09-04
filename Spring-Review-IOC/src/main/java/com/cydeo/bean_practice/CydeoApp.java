package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        //how to create a spring container
        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class,ConfigAny.class);
       FullTimeEmployee fullTimeEmployee= container.getBean(FullTimeEmployee.class);
       fullTimeEmployee.createAccount();

       PartTimeEmployee partTimeEmployee=container.getBean(PartTimeEmployee.class);
       partTimeEmployee.creatAccount();


        String str=container.getBean("str1",String.class);
        System.out.println(str);
        String str2=container.getBean("str2",String.class);
        System.out.println(str2);



    }


    }


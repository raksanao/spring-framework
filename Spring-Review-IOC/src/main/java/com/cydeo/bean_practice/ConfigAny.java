package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class ConfigAny {
    @Bean(name="str1")

   public String str(){
        return  "Welcome to Cydeo App";
    }
    @Bean(name ="str2")
 public   String str2(){
        return "Spring Core Practice";
    }

}

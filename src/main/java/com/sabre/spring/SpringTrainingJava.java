package com.sabre.spring;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public  class SpringTrainingJava {


    @RequestMapping("/")
    @ResponseBody
    String homepage() {

        return "Hellllooo World Robert";
    }


    public static void main (String [] args)
    {

        SpringApplication.run(SpringTrainingJava.class,args);
    }

}
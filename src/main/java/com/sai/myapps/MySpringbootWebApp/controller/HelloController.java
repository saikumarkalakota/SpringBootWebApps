package com.sai.myapps.MySpringbootWebApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping ("/hello")
    public String restHealth(){
        System.out.println("In the Hello Controller pointing to hello Endpoint");
        return "In the Hello Controller pointing to hello Endpoint";
    }

    @RequestMapping(method= RequestMethod.GET,value = "/helloGET")
    public String restGET(){
        System.out.println("In the Hello Controller pointing to helloGET Endpoint");
        return "In the Hello Controller pointing to helloGET Endpoint";
    }


}

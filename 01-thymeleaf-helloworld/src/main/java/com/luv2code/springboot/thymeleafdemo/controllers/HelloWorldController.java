package com.luv2code.springboot.thymeleafdemo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //need a controller method to show initial html form
    @GetMapping("/showform")
    public String showform(){
        return "helloworld-form";
    }

    //need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //need a controller method to read form data and add data to the model

   @RequestMapping("/processFormVersionTwo")
   public String letsShoutDude(HttpServletRequest request, Model model){
        //read data from html form
       String theName=request.getParameter("studentName");

       //convert data to all caps
       String theNAME = theName.toUpperCase();

       //create the message
       String result="Yo!"+theNAME;

       //add message to the model
       model.addAttribute("message",result);

       return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model){

        //convert data to all caps
        String theNAME = theName.toUpperCase();

        //create the message
        String result="Hello My friend, "+theNAME;

        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

}

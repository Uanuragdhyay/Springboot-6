package com.luv2code.springboot.thymeleafdemo.controllers;

import com.luv2code.springboot.thymeleafdemo.Model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> Countries;
    @Value("${languages}")
    private List<String> Languages;
    @Value("${systems}")
    private List<String> Systems;
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        //create a student object
        Student theStudent=new Student();

        //add a student object to theModel
        theModel.addAttribute("student",theStudent);

        //add the list of countries and languages to the model
        theModel.addAttribute("countries",Countries);
        theModel.addAttribute("languages",Languages);
        theModel.addAttribute("systems",Systems);


        return "student-form";
    }
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        //log the input data in console
        System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());

        return "student-confirmation";
    }
}

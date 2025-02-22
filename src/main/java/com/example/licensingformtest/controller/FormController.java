package com.example.licensingformtest.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.UUID;

import com.example.licensingformtest.model.App;
import com.example.licensingformtest.model.app;

@Controller
@RequestMapping("")
public class FormController {

    @GetMapping("/formTest")
    public String showForm(Model model) {
        model.addAttribute("app", new App());  
        return "formTest"; 
    }

    @PostMapping("/formTest")
    public String submitForm(@ModelAttribute("app") App app, Model model) {
        String generatedId = app.getLicensingid();
        
        
        model.addAttribute("generatedId", generatedId);


        return "formSuccess";
    }
}

package com.example.licensingformtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class FTcontroller {


    @GetMapping("/formTest")
    public String addformTest(Model model) {

        return "formTest";
    }

}
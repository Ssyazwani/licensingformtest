package licensingapp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import licensingapp.demo.model.FormData;

@Controller
@RequestMapping("/formlist")
public class Qcontroller {

    @GetMapping
    public String showFormlist(Model model) {
        FormData formData = new FormData();
        model.addAttribute("formData", formData);  

        return "formList"; 
    }

    @PostMapping
    public String submitForm(FormData formData, Model model) {
        model.addAttribute("formData", formData);
        return "formList";  
    }
}


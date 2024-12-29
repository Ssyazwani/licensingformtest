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
        // Initialize a new FormData object or fetch from a database/service
        FormData formData = new FormData();
        model.addAttribute("formData", formData);  // Add the formData object to the model

        return "formList";  // Name of the HTML file (formList.html)
    }

    @PostMapping
    public String submitForm(FormData formData, Model model) {
        // Process form submission and add attributes to the model
        model.addAttribute("formData", formData);
        return "formList";  // Redirect or return the same page
    }
}


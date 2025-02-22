package com.example.licensingformtest.model;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class app {

    @NotEmpty (message = "mandatory")
    @Size(min=3 , max = 64 , message = "Please insert Name of Company")
    private String name;

    @Email(message= "Invalid email format")
    @NotBlank(message="Please fill it in") //if u leave blank, it is an optional field
    private String email;

    //@Pattern(regexp ="\\(8|9)[0-9]{7}", message ="Invalid phone number entered")
    @Pattern(regexp = "\\d{8}", message =" please type 8 numbers")
    private String phoneNumber;

    private String Licensingid;

    public app(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //this.Licensingid = Idgenerator.generateUniqueId();
    }

    // public static app fromString(String line) {
    //     return null;
    // }   

    // public boolean Agelimit( LocalDate dateOfBirth , LocalDate currTime  ) { 
    //     int age = Period.between(currTime, dateOfBirth).getYears();
    //     if (age> 10 && age <100);
    //     return true;
    // }

    

    

   

    
    
   
}

 
package com.example.licensingformtest.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class App {

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

    public App(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.Licensingid = Idgen.generateUniqueId();
    }

    public static App fromString(String line) {
    return null;
    }   


    

    

   

    
    
   
}

 
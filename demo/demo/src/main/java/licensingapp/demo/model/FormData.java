package licensingapp.demo.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class FormData {

     @NotNull(message = "Name of Company cannot be null")
    private String name;

    @NotNull(message = "UEN cannot be null")
    private String uen;

    @NotNull(message = "Type cannot be null,MPI,SPI or MC")
    private String typeOfApplication;

  
    @NotNull(message = "Date cannot be null")
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[0-2])\\d{4}$", 
             message = "Start date must be in DDMMYYYY format")
    private LocalDate dateOfApplication;

    @NotNull(message = "Activities cannot be null")
    private String activities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getTypeOfApplication() {
        return typeOfApplication;
    }

    public void setTypeOfApplication(String typeOfApplication) {
        this.typeOfApplication = typeOfApplication;
    }

    public LocalDate getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(LocalDate dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}

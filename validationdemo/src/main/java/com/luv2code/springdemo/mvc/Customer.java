package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = " is required ")
    @Size(min=1,message = "is required")
    private String LastName;
    @NotNull(message = " is required ")
    @Min(value=0,message="must be greater than or equal to zero")
    @Max(value=10,message="must be less than 10 or equal to ")
    private Integer freePasses;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 characters")
    private String postalCode;

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

   @CourseCode(value = "TOPS",message = "must start with TOPS")
   private String courseCode;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}

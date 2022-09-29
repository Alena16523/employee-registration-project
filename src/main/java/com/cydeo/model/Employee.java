package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

   // @NotNull // field should not be null
   // @NotBlank //field should not be blank "    " -> covers all of them
    //@NotEmpty //field should not empty  ""

    @NotBlank
    @Size(max=12, min=2) //number of characters

    private String firstName;
    private String lastName;

    @NotNull
    //Thymeleaf accepts yyyy-MM-dd, but Local Date accepts mm-dd-yyyy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    //@NotBlank
    //@Email
    private String email;

    //@NotBlank
    //@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}

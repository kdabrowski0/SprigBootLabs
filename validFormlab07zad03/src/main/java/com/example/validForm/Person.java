package com.example.validForm;

import lombok.Data;
import com.example.validForm.validators.PostalCode;
import com.example.validForm.validators.Earnings;
import javax.validation.constraints.*;

@Data
public class Person {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;
    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;
    @NotNull(message = "Postal code is required")
    @PostalCode
    private String postalCode;
    @NotNull(message = "Earnings are required")
    @Earnings
    private int earnings;
    @AssertTrue(message = "conditions must be accepted")
    private boolean conditionsAccepted;
}

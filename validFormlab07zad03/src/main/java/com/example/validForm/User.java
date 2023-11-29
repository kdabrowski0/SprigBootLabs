package com.example.validForm;
import lombok.Data;

import javax.validation.constraints.*;
@Data
public class User {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;
    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;
    @NotNull(message = "Postal code is required")
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "Postal code should be in format xx-xxx")
    private String postalCode;
    @AssertTrue(message = "conditions must be accepted")
    private boolean conditionsAccepted;
    @NotNull(message = "User type is required")
    private UserType userType;
}

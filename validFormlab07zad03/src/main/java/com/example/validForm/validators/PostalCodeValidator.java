package com.example.validForm.validators;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public void initialize(PostalCode constraint) {
    }

    @Override
    public boolean isValid(String postalCode, ConstraintValidatorContext context) {
        return postalCode != null && postalCode.matches("[0-9]{2}-[0-9]{3}");
    }
}
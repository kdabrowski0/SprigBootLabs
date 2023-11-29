package com.example.validForm.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EarningsValidator implements ConstraintValidator<Earnings, Integer> {

    @Override
    public void initialize(Earnings constraint) {
    }

    @Override
    public boolean isValid(Integer earnings, ConstraintValidatorContext context) {
        return earnings != null && earnings >= 2000 && earnings <= 3000;
    }
}
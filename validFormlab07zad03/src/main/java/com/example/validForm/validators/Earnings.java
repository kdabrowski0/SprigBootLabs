package com.example.validForm.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EarningsValidator.class)
public @interface Earnings {

    String message() default "CUSTOM VALIDATOR MESSAGE: Invalid earnings value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
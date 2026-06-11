package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Constraint(validatedBy = EventSequenceValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEventSequence {
    String message() default "Start date or time must be before end date or time";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

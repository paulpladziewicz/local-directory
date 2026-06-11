package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EventSequenceValidator implements ConstraintValidator<ValidEventSequence, EventDateTimeRange> {
    @Override
    public void initialize(ValidEventSequence constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(EventDateTimeRange value, ConstraintValidatorContext context) {
        var start = value.start();
        var end = value.end();

        if (end == null) return true;

        return start.isBefore(end);
    }
}

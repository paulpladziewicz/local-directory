package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Constraint(validatedBy = EventDateTimeRangesValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoOverlappingRanges {
    String message() default "Event dates or times must not overlap. If an end date and time is not provided, another start date and time is not allowed on the same day.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

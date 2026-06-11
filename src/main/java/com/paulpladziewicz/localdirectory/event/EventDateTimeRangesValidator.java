package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Comparator;
import java.util.List;

public class EventDateTimeRangesValidator implements ConstraintValidator<NoOverlappingRanges, List<EventDateTimeRange>> {
    @Override
    public void initialize(NoOverlappingRanges constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List<EventDateTimeRange> value, ConstraintValidatorContext context) {
        if (value.isEmpty() || value.size() == 1) return true;

        List<EventDateTimeRange> sortedByStart = value.stream()
                .sorted(Comparator.comparing(EventDateTimeRange::start))
                .toList();

        for (int i = 1; i < sortedByStart.size(); i++) {
            var previous = sortedByStart.get(i - 1);
            var next = sortedByStart.get(i);

            if (previous.end() == null) {
                // if end time is not provided, the next range start date can not be the same day
                if (next.start().toLocalDate().isEqual(previous.start().toLocalDate())) {
                    return false;
                } else {
                    continue;
                }
            }

            if (next.start().isBefore(previous.end())) {
                return false;
            }
        }

        return true;
    }
}

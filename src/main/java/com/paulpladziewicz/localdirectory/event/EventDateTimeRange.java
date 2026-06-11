package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@ValidEventSequence
public record EventDateTimeRange(@NotNull LocalDateTime start, LocalDateTime end) {
}

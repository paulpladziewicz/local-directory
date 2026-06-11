package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record EventDto(@NotBlank(message = "Event title is required") String title,
                       String description,
                       @NotBlank(message = "Event location name is required") String locationName,
                       @NotNull(message = "At least one event date and time range is required") @NoOverlappingRanges @Valid List<EventDateTimeRange> eventDateTimeRanges
) {
}

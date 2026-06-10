package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.constraints.NotBlank;

public record EventDto(@NotBlank(message="Event title is required") String title, String description, @NotBlank(message="Event location name is required") String locationName) {
}

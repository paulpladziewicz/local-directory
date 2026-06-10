package com.paulpladziewicz.localdirectory.event;

import jakarta.validation.constraints.NotBlank;

public record EventDto(@NotBlank String title, String description, @NotBlank String locationName) {
}

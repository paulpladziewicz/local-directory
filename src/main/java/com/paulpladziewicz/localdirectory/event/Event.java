package com.paulpladziewicz.localdirectory.event;

import com.paulpladziewicz.localdirectory.content.ContentDetail;
import lombok.Data;

@Data
public class Event implements ContentDetail {
    private String title;
    private String description;
    private String locationName;

    public static Event from(EventDto dto) {
        var event = new Event();
        event.setTitle(dto.title());
        event.setDescription(dto.description());
        event.setLocationName(dto.locationName());
        return event;
    }
}

package com.paulpladziewicz.localdirectory.event;

import com.paulpladziewicz.localdirectory.content.ContentDetail;
import lombok.Data;

import java.util.List;

@Data
public class Event implements ContentDetail {
    private String title;
    private String description;
    private String locationName;
    private List<EventDateTimeRange> eventDateTimeRanges;

    public static Event from(EventDto dto) {
        var event = new Event();
        event.setTitle(dto.title());
        event.setDescription(dto.description());
        event.setLocationName(dto.locationName());
        event.setEventDateTimeRanges(dto.eventDateTimeRanges());
        return event;
    }
}

package com.paulpladziewicz.localdirectory.event;

import com.paulpladziewicz.localdirectory.content.ContentDetail;
import lombok.Data;

@Data
public class Event implements ContentDetail {
    private String title;
    private String description;
    private String locationName;
}

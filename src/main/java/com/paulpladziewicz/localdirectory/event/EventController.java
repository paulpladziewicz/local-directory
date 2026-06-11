package com.paulpladziewicz.localdirectory.event;

import com.paulpladziewicz.localdirectory.content.Content;
import com.paulpladziewicz.localdirectory.content.ContentService;
import com.paulpladziewicz.localdirectory.content.ContentType;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("events")
public class EventController {
    private final ContentService service;

    public EventController(ContentService service) {
        this.service = service;
    }

    @PostMapping
    public Content create(@Valid @RequestBody EventDto dto) {
        return service.create(ContentType.EVENT, Event.from(dto));
    }
}

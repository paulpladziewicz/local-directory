package com.paulpladziewicz.localdirectory.content;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("content")
public class ContentController {
    private final ContentService service;

    public ContentController(ContentService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Content> getAll(@RequestParam ContentType contentType, Pageable pageable) {
        return service.findByType(contentType, pageable);
    }
}

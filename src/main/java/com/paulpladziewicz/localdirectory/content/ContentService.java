package com.paulpladziewicz.localdirectory.content;

import org.springframework.stereotype.Service;

@Service
public class ContentService {
    private final ContentRepository repository;

    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public Content create(ContentType type, ContentDetail detail) {
        var content = new Content();
        content.setType(type);
        content.setDetail(detail);
        return repository.save(content);
    }
}

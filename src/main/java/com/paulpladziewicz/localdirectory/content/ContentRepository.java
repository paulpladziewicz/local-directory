package com.paulpladziewicz.localdirectory.content;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends MongoRepository<Content, String> {
    Page<Content> findByTypeAndVisibility(ContentType contentType, ContentVisibility visibility, Pageable pageable);
}

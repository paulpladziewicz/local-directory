package com.paulpladziewicz.localdirectory.content;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "content")
public class Content {
    @Id
    private String id;

    private ContentType type;

    private ContentStatus status = ContentStatus.ACTIVE;

    private ContentVisibility visibility = ContentVisibility.VISIBLE;

    private ContentDetail detail;

    private String createdBy;

    private String updatedBy;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    private boolean moderated = false;

    @Version
    private Long version;
}

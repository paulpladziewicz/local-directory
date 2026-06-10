package com.paulpladziewicz.localdirectory.content;

public enum ContentType {
    EVENT;

    public String toHyphenatedString() {
        return this.name().toLowerCase().replace('_', '-');
    }
}

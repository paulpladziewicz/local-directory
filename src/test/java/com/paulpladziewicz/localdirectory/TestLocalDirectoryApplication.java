package com.paulpladziewicz.localdirectory;

import org.springframework.boot.SpringApplication;

public class TestLocalDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.from(LocalDirectoryApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

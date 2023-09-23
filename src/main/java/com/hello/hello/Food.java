package com.hello.hello;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Food {
    @Getter
    private String name;
    @Getter
    private String materials;
    @Getter
    private String country;
}

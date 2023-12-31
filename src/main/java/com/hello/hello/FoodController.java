package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @GetMapping("/food")
    public List<Food> food() {
        List<Food> foods = List.of(
                new Food("hamburger", "meat&bread&cheese", "USA"),
                new Food("pizza", "tomato&bread&cheese", "Italy"),
                new Food("sushi", "fish&rice", "Japan"),
                new Food("curry", "spices&vegetables", "India"),
                new Food("Peking duck", "duck&vegetables", "China")
        );
        return foods;
    }
}

package org.example.itmpj3212.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}

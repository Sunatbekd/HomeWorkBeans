package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fish  implements Animal{
@Value("${breedOfFish}")
    private String breedOfFish;
@Value("${color}")
    private String color;

    public String getBreedOfFish() {
        return breedOfFish;
    }

    public void setBreedOfFish(String breedOfFish) {
        this.breedOfFish = breedOfFish;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("I like eat fish");
        System.out.println(getBreedOfFish());
        System.out.println(getColor());
    }

    @Override
    public void animalMinus() {
        System.out.println("I don't like clear fish");
    }
}

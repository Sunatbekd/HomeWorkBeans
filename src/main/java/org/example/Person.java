package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("app.properties")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    public Person() {
    }
@Autowired
    public Person(@Qualifier("fish") Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @PostConstruct
    public void init(){
        System.out.println("Start init mathod");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("This destroy method the closed app");
    }

    public void YourFavoriteAnimal(){
        animal.animalPlus();
    }

}

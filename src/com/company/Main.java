package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (Animal animal: animals) {
            if (animal instanceof Shark)
            animal.move();
        }
        for (Animal animal: animals) {
            if (animal instanceof Turtle)
                animal.move();
        }
        for (Animal animal: animals) {
            if (animal instanceof Eagle)
                animal.move();
        }
        for (Animal animal: animals) {
            System.out.println(animal.getClass());
        }
        System.out.println(Arrays.toString(animals));
//
//        Shark[] sharks = {(Shark) animals[0]};
//        Turtle[] turtles = {(Turtle) animals[1]};
//        Eagle[] eagles = {(Eagle) animals[2]};

    }
}

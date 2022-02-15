package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //good job
        //create your own fields || methods with your logic
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
        // your algorithm is true, but you have to spend a lot of time to see result!
        // i mean your code works slowly
        
       //my version
        
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                animal.move();
            } else  if (animal instanceof Turtle) {
                animal.move();
            } else if (animal instanceof Eagle) {
                animal.move();
            }
        }
//
//        Shark[] sharks = {(Shark) animals[0]};
//        Turtle[] turtles = {(Turtle) animals[1]};
//        Eagle[] eagles = {(Eagle) animals[2]};

    }
}

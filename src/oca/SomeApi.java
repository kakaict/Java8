package oca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khaitq
 * Date: 26/11/2018
 * Github:  https://github.com/quangkhai88
 */

public class SomeApi {


    public static void main(String ...args) {


        Animal a = new Animal("");

        Dog d = new Dog();

        Animal t = d;

        Boolean b = new Boolean("TRUE");


        System.out.println("vvvvv");

        System.out.println(new String("v") == new String("v"));

        Runnable r = new Counter(1);

        if (r instanceof Animal) {
            System.out.println(444);
        }
    }

    public static void SomeApi() {

        class inner2 {


        }
    }

    static class inner implements  Runnable {


        @Override
        public void run() {

        }
    }

}

class Counter extends Animal implements  Runnable {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }

    @Override
    public void run() {

    }
}

 class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
        System.out.println("Anmal");
    }

    public String getName() {
        return name;
    }
}


class Dog extends Animal {

    protected String breed;

    Dog() {

        System.out.println("dog");
    }

    Dog(String breed) {
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
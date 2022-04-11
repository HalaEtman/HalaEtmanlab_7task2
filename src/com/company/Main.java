package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Animal animal[] = new Animal[6];

        animal[0] = new Mammal("Boo", 3, 2, "black");
        animal[1] = new Dog("Doxy", 3, 15,"gold", "golden retriever");
        animal[2] = new Bird("flfl", 15, 1, "blue");
        animal[3] = new Pigeon("ted", 20000, 3, "white and black", "koko");
        animal[4] = new Fish("dory", 15, 15, "blue");
        animal[5] = new Blowfish("Nemo", 500, 2000, "red","adventurer");

        System.out.println(animal[1].getVoice());
        animal[5].eat("fish");
        System.out.println(animal[4].toString());

    }

}
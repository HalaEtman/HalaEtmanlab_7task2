package com.company;

public class Dog extends Mammal{

    String species_Etman_57120;

    public Dog(){
        species_Etman_57120 = "NN";
    }

    public Dog(String name_Etman_57120, int age_Etman_57120, int weight_Etman_57120, String skinColor_Etman_57120, String species_Etman_57120) {
        super(name_Etman_57120, age_Etman_57120, weight_Etman_57120, skinColor_Etman_57120);
        this.species_Etman_57120 = species_Etman_57120;
    }

    public Dog(int age_Etman_57120, String skinColor_Etman_57120, String species_Etman_57120) {
        super(age_Etman_57120, skinColor_Etman_57120);
        this.species_Etman_57120 = species_Etman_57120;
    }

    @Override
    public void eat(String foodName_Etman_57120) {
        System.out.println("Dogs eat "+ foodName_Etman_57120);
    }

    @Override
    public String getVoice() {
        return super.getVoice();
    }

    public String getSpecies_Etman_57120() {
        return species_Etman_57120;
    }

    public void setSpecies_Etman_57120(String species_Etman_57120) {
        this.species_Etman_57120 = species_Etman_57120;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name_Etman_57120='" + name_Etman_57120 + '\'' +
                ", age_Etman_57120=" + age_Etman_57120 +
                ", weight_Etman_57120=" + weight_Etman_57120 +
                ", species_Etman_57120='" + species_Etman_57120 + '\'' +
                ", skinColor_Etman_57120='" + skinColor_Etman_57120 + '\'' +
                '}';
    }
}
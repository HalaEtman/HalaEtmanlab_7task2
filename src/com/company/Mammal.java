package com.company;

public class Mammal extends Animal{

    String skinColor_Etman_57120;

    public Mammal(){
        skinColor_Etman_57120 = "NN";
    }

    public Mammal(String name_Etman_57120, int age_Etman_57120, int weight_Etman_57120, String skinColor_Etman_57120) {
        super(name_Etman_57120, age_Etman_57120, weight_Etman_57120);
        this.skinColor_Etman_57120 = skinColor_Etman_57120;
    }

    public Mammal(int age_Etman_57120, String skinColor_Etman_57120) {
        super(age_Etman_57120);
        this.skinColor_Etman_57120 = skinColor_Etman_57120;
    }

    @Override
    public void eat(String foodName_Etman_57120) {
        System.out.println("Mammals eat " + foodName_Etman_57120);
    }

    @Override
    public String getVoice() {
        String mammalsVoice_Etman_57120 = "Mammals has sound";
        return mammalsVoice_Etman_57120;
    }

    public String getSkinColor_Etman_57120() {
        return skinColor_Etman_57120;
    }

    public void setSkinColor_Etman_57120(String skinColor_Etman_57120) {
        this.skinColor_Etman_57120 = skinColor_Etman_57120;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name_Etman_57120='" + name_Etman_57120 + '\'' +
                ", age_Etman_57120=" + age_Etman_57120 +
                ", weight_Etman_57120=" + weight_Etman_57120 +
                ", skinColor_Etman_57120='" + skinColor_Etman_57120 + '\'' +
                '}';
    }
}
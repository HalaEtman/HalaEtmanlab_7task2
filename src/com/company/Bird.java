package com.company;

public class Bird extends Animal{
    String featherColor_Etman_57120;

    public Bird(){
        featherColor_Etman_57120 = "NN";
    }

    public Bird(String name_Etman_57120, int age_Etman_57120, int weight_Etman_57120, String featherColor_Etman_57120) {
        super(name_Etman_57120, age_Etman_57120, weight_Etman_57120);
        this.featherColor_Etman_57120 = featherColor_Etman_57120;
    }

    public Bird(int age_Etman_57120, String featherColor_Etman_57120) {
        super(age_Etman_57120);
        this.featherColor_Etman_57120 = featherColor_Etman_57120;
    }

    @Override
    public void eat(String foodName_Etman_57120) {
        System.out.println("Birds eat " + foodName_Etman_57120);
    }

    @Override
    public String getVoice() {
        String birdVoice_Etman_57120 = "Birds has sound";
        return birdVoice_Etman_57120;
    }

    public String getFeatherColor_Etman_57120() {
        return featherColor_Etman_57120;
    }

    public void setFeatherColor_Etman_57120(String featherColor_Etman_57120) {
        this.featherColor_Etman_57120 = featherColor_Etman_57120;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name_Etman_57120='" + name_Etman_57120 + '\'' +
                ", age_Etman_57120=" + age_Etman_57120 +
                ", weight_Etman_57120=" + weight_Etman_57120 +
                ", featherColor_Etman_57120='" + featherColor_Etman_57120 + '\'' +
                '}';
    }
}
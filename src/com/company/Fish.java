package com.company;

public class Fish extends Animal{

    String scalesColor_Etman_57120;

    public Fish(){
        scalesColor_Etman_57120 = "NN";
    }

    public Fish(String name_Etman_57120, int age_Etman_57120, int weight_Etman_57120, String scalesColor_Etman_57120) {
        super(name_Etman_57120, age_Etman_57120, weight_Etman_57120);
        this.scalesColor_Etman_57120 = scalesColor_Etman_57120;
    }

    public Fish(int age_Etman_57120, String scalesColor_Etman_57120) {
        super(age_Etman_57120);
        this.scalesColor_Etman_57120 = scalesColor_Etman_57120;
    }

    @Override
    public void eat(String foodName_Etman_57120) {
        System.out.println("Fish eat "+ foodName_Etman_57120);
    }

    @Override
    public String getVoice() {
        String fishVoice = "Not all Fish has sound";
        return fishVoice;
    }

    public String getScalesColor_Etman_57120() {
        return scalesColor_Etman_57120;
    }

    public void setScalesColor_Etman_57120(String scalesColor_Etman_57120) {
        this.scalesColor_Etman_57120 = scalesColor_Etman_57120;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name_Etman_57120='" + name_Etman_57120 + '\'' +
                ", age_Etman_57120=" + age_Etman_57120 +
                ", weight_Etman_57120=" + weight_Etman_57120 +
                ", scalesColor_Etman_57120='" + scalesColor_Etman_57120 + '\'' +
                '}';
    }
}
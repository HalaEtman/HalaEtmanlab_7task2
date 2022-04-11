package com.company;

abstract class Animal {

    String name_Etman_57120;
    int age_Etman_57120;
    int weight_Etman_57120;

    public Animal(){
        age_Etman_57120 = weight_Etman_57120 = 0;
        name_Etman_57120 = "NN";
    }

    public Animal(String name_Etman_57120, int age_Etman_57120, int weight_Etman_57120) {
        this.name_Etman_57120 = name_Etman_57120;
        this.age_Etman_57120 = age_Etman_57120;
        this.weight_Etman_57120 = weight_Etman_57120;
    }

    public Animal (int age_Etman_57120){this.age_Etman_57120 = age_Etman_57120;}

    public abstract void eat(String foodName_Etman_57120);

    public abstract String getVoice();

    public String getName_Etman_57120() {
        return name_Etman_57120;
    }

    public void setName_Etman_57120(String name_Etman_57120) {
        this.name_Etman_57120 = name_Etman_57120;
    }

    public int getAge_Etman_57120() {
        return age_Etman_57120;
    }

    public void setAge_Etman_57120(int age_Etman_57120) {
        this.age_Etman_57120 = age_Etman_57120;
    }

    public int getWeight_Etman_57120() {
        return weight_Etman_57120;
    }

    public void setWeight_Etman_57120(int weight_Etman_57120) {
        this.weight_Etman_57120 = weight_Etman_57120;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name_Etman_57120='" + name_Etman_57120 + '\'' +
                ", age_Etman_57120=" + age_Etman_57120 +
                ", weight_Etman_57120=" + weight_Etman_57120 +
                '}';
    }
}
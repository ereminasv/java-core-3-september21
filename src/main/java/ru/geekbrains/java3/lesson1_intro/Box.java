package ru.geekbrains.java3.lesson1_intro;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList <T> fruit;

    public Box() {
        fruit = new ArrayList<>();
    }

    public ArrayList<T> getFruit() {
        return fruit;
    }

    public void setFruit(ArrayList<T> fruit) {
        this.fruit = fruit;
    }

    public float getWeightBox (){
        float weightBox = fruit.size()*fruit.get(0).getWeight();
        return weightBox;
    }

    public boolean compare (Box<?> another){
        return Math.abs(this.getWeightBox() - another.getWeightBox()) < 0.0001;
    }

    public void pourFruit (Box<T> another) {
        another.fruit.addAll(fruit);
        fruit.clear();
    }

    public void addFruits (T extraFruit){
         fruit.add(extraFruit);
    }
}

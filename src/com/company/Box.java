package com.company;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public float getWeight(){
        float weight = 0.0f;
        for (T t : box) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox){
        if (getWeight() == anotherBox.getWeight())
            return true;
        return false;
    }

    public void addFruit(T fruit, int quantity){
        for (int i = 0; i < quantity; i++) {
            box.add(fruit);
        }
    }

    public void pourItOver(Box <T> anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }
}

package ru.bvkuchin.homework1.components;

import java.util.ArrayList;

public class Box<T extends AbstractFruit> {
    private ArrayList<T> storedFruits = new ArrayList<>();

    public void addFruit(T fruit) {
        storedFruits.add(fruit);
    }

    public double getWeight() {
        return storedFruits.stream().mapToDouble(fruit -> fruit.getWeight() ).sum();
    }

    public boolean compare(Box<?> box) {
        if (Math.abs(this.getWeight() - box.getWeight()) < 0.001) {
            return true;
        } else {
            return false;
        }
    }

    public void transfer(Box<T> destinationBox) {
        storedFruits.stream().forEach(fruit -> {
            destinationBox.addFruit(fruit);
        });
        storedFruits.clear();
    }
}

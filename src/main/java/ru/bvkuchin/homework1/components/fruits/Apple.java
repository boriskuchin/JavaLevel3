package ru.bvkuchin.homework1.components.fruits;

import ru.bvkuchin.homework1.components.AbstractFruit;

public class Apple extends AbstractFruit {
    private final float weight = 1.0f;

    public Apple() {
    }

    @Override
    public float getWeight() {
        return weight;
    }
}

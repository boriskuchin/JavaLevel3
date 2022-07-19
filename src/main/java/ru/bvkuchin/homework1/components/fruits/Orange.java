package ru.bvkuchin.homework1.components.fruits;

import ru.bvkuchin.homework1.components.AbstractFruit;

public class Orange extends AbstractFruit {
    private final float weight = 1.5f;

    public Orange() {
    }

    @Override
    public float getWeight() {
        return weight;
    }
}

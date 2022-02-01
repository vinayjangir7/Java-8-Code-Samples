package com.github.vinayjangir7.Java8.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private DishType dishType;

    public static List<Dish> getDishes(int numberOfDishes) {
        List<Dish> dishes = new ArrayList<>();
        Random random = new Random();
        final int MAX_CALORIES = 999;
        for (int i = 0; i < numberOfDishes; i++) {
            Dish dish = new Dish();
            dish.setCalories(random.nextInt(MAX_CALORIES));
            dish.setType(DishType.values()[random.nextInt(DishType.values().length)]);
            dish.setVegetarian(dish.getType().equals(DishType.OTHER));
            dish.setName("Dish - " + dish.getType() + " - " + i);
            dishes.add(dish);
        }
        return dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public DishType getType() {
        return dishType;
    }

    public void setType(DishType dishType) {
        this.dishType = dishType;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + dishType +
                '}';
    }

    public enum DishType {MEAT, OTHER, FISH}
}

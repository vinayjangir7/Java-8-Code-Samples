package com.github.vinayjangir7.Java8.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toy {
    private Color color;
    private Size size;
    private Category category;
    private ExecutionType executionType;
    private double price;

    public static List<Toy> getToys(int numberOfToys) {
        List<Toy> toys = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfToys; i++) {
            Toy t = new Toy();
            t.setCategory(Category.values()[random.nextInt(Category.values().length)]);
            t.setColor(Color.values()[random.nextInt(Color.values().length)]);
            t.setExecutionType(ExecutionType.values()[random.nextInt(ExecutionType.values().length)]);
            t.setPrice(i);
            t.setSize(Size.values()[random.nextInt(Size.values().length)]);
            toys.add(t);
        }
        return toys;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ExecutionType getExecutionType() {
        return executionType;
    }

    public void setExecutionType(ExecutionType executionType) {
        this.executionType = executionType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public enum Color {RED, GREEN, BLUE, YELLOW, PINK}

    public enum Size {SMALL, MEDIUM, LARGE}

    public enum Category {INFANT, BOY, GIRL, COMMON}

    public enum ExecutionType {MANUAL, BATTERY}
}

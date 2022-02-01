package com.company.module2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ToyDemo {
    static Predicate<Toy> girlToys = toy -> Toy.Category.GIRL.equals(toy.getCategory());
    static Predicate<Toy> infantToys = toy -> Toy.Category.INFANT.equals(toy.getCategory());
    static Predicate<Toy> batteryOperatedToys = toy -> Toy.ExecutionType.BATTERY.equals(toy.getExecutionType());
    static Predicate<Toy> manuallyOperatedToys = toy -> Toy.ExecutionType.MANUAL.equals(toy.getExecutionType());
    static Predicate<Toy> pinkColorToys = (Toy toy) -> Toy.Color.PINK.equals(toy.getColor());
    static Consumer<Toy> printToyCategory = toy -> System.out.println(toy.getCategory());

    public static void main(String[] args) {
        List<Toy> toys = Toy.getToys(20);
        toys.stream().filter(girlToys).forEach(printToyCategory);
        toys.stream().filter(batteryOperatedToys.and(infantToys)).forEach(t ->
        {
            System.out.println(t.getCategory());
            System.out.println(t.getExecutionType());
        });

        toys.stream().filter(pinkColorToys.and(manuallyOperatedToys).and(girlToys)).forEach(t ->
        {
            System.out.println(t.getCategory());
            System.out.println(t.getExecutionType());
            System.out.println(t.getColor());
        });

    }
}

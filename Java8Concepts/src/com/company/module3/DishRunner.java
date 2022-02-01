package com.company.module3;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DishRunner {
    public static void main(String[] args) {
        List<Dish> dishList = Dish.getDishes(20);
        printDishes(dishList);
        int count = getCaloriesCountForNonVegDishes(dishList);
        //System.out.println("count = " + count);
        Map<Boolean, List<Dish>> groupedDishesByType = getGroupedDishesByType(dishList);
        Map<Dish.Type, List<Dish>> groupedDishesByActualType = getGroupedDishesByActualType(dishList);
        System.out.println(groupedDishesByType.toString());
        System.out.println(groupedDishesByActualType.toString());
    }

    private static List<Dish> getVegDishes(List<Dish> dishes) {
        return dishes.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
    }

    private static List<Dish> getFirstNVegDishes(List<Dish> dishes, int n) {
        return dishes.stream().filter(Dish::isVegetarian).limit(n).collect(Collectors.toList());
    }

    private static List<Dish> getRestSkippedNVegDishes(List<Dish> dishes, int n) {
        return dishes.stream().filter(Dish::isVegetarian).skip(n).collect(Collectors.toList());
    }

    private static int getCaloriesCountForNonVegDishes(List<Dish> dishes) {
        return dishes.stream().filter(Predicate.not(Dish::isVegetarian)).mapToInt(Dish::getCalories).sum();
    }

    private static Map<Boolean, List<Dish>> getGroupedDishesByType(List<Dish> dishes) {
        return dishes.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
    }

    private static Map<Dish.Type, List<Dish>> getGroupedDishesByActualType(List<Dish> dishes) {
        return dishes.stream()
                .collect(Collectors.groupingBy(Dish::getType));
    }

    private static Map<Boolean, IntSummaryStatistics> getGroupedDishesByTypeWithSummarizedCalories(List<Dish> dishes) {
        return dishes.stream()
                .collect(Collectors.groupingBy(Dish::isVegetarian, Collectors.summarizingInt(Dish::getCalories)));
    }

    private static void printDishes(List<Dish> dishes) {
        dishes.forEach(System.out::println);
    }
}

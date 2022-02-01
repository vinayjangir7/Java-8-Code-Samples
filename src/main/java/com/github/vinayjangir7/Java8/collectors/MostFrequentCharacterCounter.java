package com.github.vinayjangir7.Java8.collectors;

import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentCharacterCounter {

    public char getCharacter(String message) {
        return message.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();

    }

}

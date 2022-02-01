package com.company.exam;

import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentCharacterCounter implements CharacterCounter {
    private String message = "";

    public MostFrequentCharacterCounter(String message) {
        this.message = message;
    }

    @Override
    public char getCharacter() {
        return message.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();

    }

}

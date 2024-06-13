package com.valdonet.primeiraescolha.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class MainEuroMillion {
    
    public static void main(String[] args) throws IOException {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50);

        List<List<Integer>> comb = new ArrayList<>();
        combinations(numbers, new ArrayList<>(), comb, 6);

        List<String> textToWrite = comb.stream()
                .map(list -> list.stream().map(Object::toString).collect(Collectors.joining(", ")))
                .collect(Collectors.toList());

        Path filePath = Paths.get("Combinations.txt");
        Files.write(filePath, textToWrite, StandardCharsets.UTF_8);


//        Path filePath = Paths.get("Combinations.txt");
//        try {
//            Files.write(filePath, comb.stream().map(Object::toString).collect(Collectors.toList()), StandardCharsets.UTF_8);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        List<List<Integer>> comb = new ArrayList<>();
//        combinations(numbers, new ArrayList<>(), comb, 6);


//        int count = 0;
//        for (List<Integer> c : comb) {
//            count++;
//            System.out.println("Column " + count + " - " + c);
//        }
    }
    
    public static void combinations(List<Integer> input, List<Integer> current, List<List<Integer>> result, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < input.size(); i++) {
            current.add(input.get(i));
            combinations(input.subList(i + 1, input.size()), current, result, k - 1);
            current.remove(current.size() - 1);
        }
    }
}

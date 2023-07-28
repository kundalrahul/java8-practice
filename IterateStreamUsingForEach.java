package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateStreamUsingForEach {

    public static void main(String[] args) {
        List<Integer> listOfIntegers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        listOfIntegers.stream().forEach(System.out::println);
    }
}

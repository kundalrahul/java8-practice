package com.java8.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxNumInStream {
    public static void main(String[] args) {
        List<Integer> listOfInteger =
                Arrays.asList(10, 55, 2, 1);

        Integer max = listOfInteger.stream().max(Comparator.comparing(
                Integer::valueOf)).get();
        System.out.println(max);
    }

}

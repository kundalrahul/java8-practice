package com.java8.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinimumNumberInStream {

    public static void main(String[] args) {
        List<Integer> listOfInteger =
                Arrays.asList(10, 55, 2, 1);

        Optional<Integer> min = listOfInteger.stream().min(Comparator.comparing(
                Integer::valueOf));

        if(min.isPresent())
            System.out.println(min.get());

    }
}

package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        list.stream().distinct().forEach(System.out::println);

        //or
        System.out.println("-----------------------");
        list.stream().collect(Collectors.toSet()).forEach(System.out::print);
    }
}

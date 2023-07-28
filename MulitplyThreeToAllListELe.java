package com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class MulitplyThreeToAllListELe {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        intList.stream().map(x -> x * 3).forEach(System.out::println);
    }
}

package com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,1,44,33,444,53);
        integerList.stream().mapToInt(Integer::intValue).sum();
    }
}

package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWhosLenGreaterThanThree {

    public static void main(String[] args) {
        List<String> listOfString =
                Arrays.asList("ABCD", "pq", "AAAA");

        List<String> strList = listOfString.stream().filter(str -> str.length() > 3)
                .collect(Collectors.toList());
        strList.forEach(System.out::println);
    }
}

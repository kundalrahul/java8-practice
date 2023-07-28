package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStreams {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Integer> strList = Arrays.asList(5, 6, 7, 8);

        Stream<Integer> concatStream =
                Stream.concat(intList.stream(), strList.stream());
        concatStream.forEach(System.out::println);

    }
}

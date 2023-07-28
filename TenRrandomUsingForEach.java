package com.java8.practice;

import java.util.Random;

public class TenRrandomUsingForEach {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10)
                .forEach(System.out::println);
    }
}

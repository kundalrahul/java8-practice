package com.java8.practice;

public class DateTimeAPI {

    public static void main(String[] args) {
        System.out.println("Today's Date: " + java.time.LocalDateTime.now());
        System.out.println("Today's Date: " + java.time.LocalDate.now());
        System.out.println("Today's Time: " + java.time.LocalTime.now());
    }
}

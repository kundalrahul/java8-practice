package com.java8.practice;

import javax.sound.midi.Soundbank;
import java.util.StringJoiner;

public class StringPrefixAndSuffix {
    public static void main(String[] args) {
        StringJoiner stringJoiner =
                new StringJoiner(",", "StartOfString-",
                        "-EndOfString");
        stringJoiner.add("Rahul");
        stringJoiner.add("Prakashlal");
        stringJoiner.add("Kundal");
        System.out.println(stringJoiner);


    }
}

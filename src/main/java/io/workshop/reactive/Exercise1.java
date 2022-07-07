package io.workshop.reactive;

import io.workshop.reactive.sources.StreamSources;

import java.util.Optional;

import static java.lang.System.out;

public class Exercise1 {

    public static void main(String[] args) {

        // TODO: PRINT ALL STRING and INT NUMBERS
        //StreamSources.bringNumbersAsString().forEach(out::println);
        //StreamSources.bringNumbersAsInteger().forEach(out::println);

        // TODO: PRINT ALL NUMBERS THAT ARE LESS THAN 5
        //StreamSources.bringNumbersAsInteger().filter(num -> num < 5).forEach(out::println);

        // TODO: PRINT THE SECOND AND THIRD NUMBER THATS GREATER THAN 5
//        StreamSources.bringNumbersAsInteger().filter(num -> num > 5)
//                .skip(1)
//                .limit(2)
//                .forEach(out::println);

        // TODO: PRINT THE FIRST NUMBER THATS GREATER THAN 5. IF THERES NOTHING FOUND PRINT -1
        StreamSources.bringNumbersAsInteger()
                .filter(num -> num > 5)
                .findFirst()
                .ifPresent(out::println);
    }
}

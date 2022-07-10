package io.workshop.reactive;

import io.workshop.reactive.sources.StreamSources;

import java.util.Arrays;

import static java.lang.System.out;

public class Exercise1 {

    public static void main(String[] args) {

        // TODO: PRINT ALL STRING and INT NUMBERS
        StreamSources.bringNumbersAsString()
                .forEach(out::println);

        StreamSources.bringNumbersAsInteger()
                .forEach(out::println);

        // TODO: PRINT ALL NUMBERS THAT ARE LESS THAN 5
        StreamSources.bringNumbersAsInteger()
                .filter(num -> num < 5)
                .forEach(out::println);

        // TODO: PRINT THE SECOND AND THIRD NUMBER THATS GREATER THAN 5
        StreamSources.bringNumbersAsInteger()
                .filter(num -> num > 5)
                .skip(1)
                .limit(2)
                .forEach(out::println);

        // TODO: PRINT THE FIRST NUMBER THATS GREATER THAN 5. IF THERES NOTHING FOUND PRINT -1
        StreamSources.bringNumbersAsInteger()
                .filter(num -> num > 5)
                .findFirst()
                .ifPresentOrElse(val -> {
                   out.println(String.valueOf(val));
                }, () -> {
                    out.println("-1");
                });

        // TODO: Print first names of all users in userStream
        StreamSources.bringUsers()
                .forEach(user -> {
                    Arrays.stream(user.getName().split(" "))
                    .findFirst()
                    .ifPresent(out::println);
                });

        // TODO: Print first names in userStream for users that have IDs from number stream
        StreamSources.bringUsers()
                // Filter users which ID is not contained in Stream of IDS. Then pass the users filtered to a list
                .filter(
                        user -> StreamSources.bringNumbersAsInteger()
                                .toList()
                                .contains(user.getId()))
                .toList()

                // For each item: splitt its name into an Array Stream then get the first element of the Array which is first name
                .forEach( user -> {
                    Arrays.stream(user.getName().split(" "))
                            .findFirst()
                            .ifPresent(out::println);
                });
    }
}

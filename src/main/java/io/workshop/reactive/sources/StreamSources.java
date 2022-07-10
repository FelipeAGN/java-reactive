package io.workshop.reactive.sources;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> bringNumbersAsString(){
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "then");
    }

    public static Stream<Integer> bringNumbersAsInteger(){
        return Stream.iterate(0, i -> i+2).limit(10);
    }

    // Cristiano Ronaldo and Diego Maradona have the same ID on purpose...
    public static Stream<User> bringUsers(){
        return Stream.of(new User(1, "Lionel Messi", "lm@gmail.com"),
                new User(2, "Cristiano Ronaldo", "cr@gmail.com"),
                new User(2, "Diego Maradona", "dm@gmail.com"),
                new User(4, "Zinadine Zidane", "zz@gmail.com"),
                new User(66, "Felipe Flores", "ff@gmail.com"),
                new User(6, "Gareth Bale", "gb@gmail.com"),
                new User(7, "Un Jugador", "uj@gmail.com"),
                new User(93, "Dos Jugador", "dj@gmail.com"),
                new User(9, "Tres Jugador", "tj@gmail.com"),
                new User(9, "Cuatro Jugador", "cj@gmail.com")
        );
    }

}

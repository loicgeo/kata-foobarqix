package fr.rli.foobarqix;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        FooBarQixConverter fbqConverter = new FooBarQixConverter();

        IntStream.range(0, 100).forEach(
                input -> System.out.println(fbqConverter.convert(input))
        );
    }
}
package fr.rli.foobarqix;

import java.util.stream.IntStream;

public class Main {

    /**
     * Convert and print conversion result for range of numbers, from 1 to 100.
     *
     * @param args no arg needed here
     * @see README.md for conversion rules.
     */
    public static void main(String[] args) {
        FooBarQixConverter fooBarQixConverter = new FooBarQixConverter();

        IntStream.range(0, 100).forEach(
                number -> {
                    String conversionResult = fooBarQixConverter.convert(number);
                    printConversion(conversionResult);
                }
        );
    }

    private static void printConversion(String converted) {
        System.out.println(converted);
    }
}
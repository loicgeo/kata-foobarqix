package fr.rli.foobarqix;

import java.util.Map;
import java.util.stream.Collectors;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";
    public static final String FIVE_AS_STRING = "Bar";
    public static final String SEVEN_AS_STRING = "Qix";

    private static final Map<Integer, String> DIVISION_CONVERTER_RULES = Map.of(3, "Foo", 5, "Bar");

    public String convert(int inputNumber) {
        StringBuilder convertedInput = new StringBuilder();

        divisibleConversion(inputNumber, convertedInput);
        containConversion(inputNumber, convertedInput);

        return convertedInput.length() == 0 ? String.valueOf(inputNumber) : convertedInput.toString();
    }

    private void divisibleConversion(int inputNumber, StringBuilder convertedInput) {
        String conversionResult = DIVISION_CONVERTER_RULES.keySet()
                .stream()
                .filter(divisor -> inputNumber % divisor == 0)
                .map(DIVISION_CONVERTER_RULES::get)
                .collect(Collectors.joining());

        convertedInput.append(conversionResult);
    }

    private void containConversion(int inputNumber, StringBuilder convertedInput) {
        String inputToString = String.valueOf(inputNumber);

        for (Character inputDigit : inputToString.toCharArray()) {
            if (inputDigit == '3') {
                convertedInput.append(THREE_AS_STRING);
            } else if (inputDigit == '5') {
                convertedInput.append(FIVE_AS_STRING);
            } else if (inputDigit == '7') {
                convertedInput.append(SEVEN_AS_STRING);
            }
        }
    }
}

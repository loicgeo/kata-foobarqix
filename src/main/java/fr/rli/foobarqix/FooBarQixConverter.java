package fr.rli.foobarqix;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Character.getNumericValue;

public class FooBarQixConverter {

    private static final Map<Integer, String> DIVISION_CONVERTER_RULES;
    private static final Map<Integer, String> CONTAIN_CONVERTER_RULES = Map.of(3, "Foo", 5, "Bar", 7, "Qix");

    static {
        Map<Integer, String> divisionConverterMap = new LinkedHashMap<>();
        divisionConverterMap.put(3, "Foo");
        divisionConverterMap.put(5, "Bar");

        DIVISION_CONVERTER_RULES = Collections.unmodifiableMap(divisionConverterMap);
    }

    public String convert(int inputNumber) {
        StringBuilder convertedInput = new StringBuilder();

        convertedInput.append(divisibleConversion(inputNumber));
        convertedInput.append(containConversion(inputNumber));

        return convertedInput.length() == 0 ? String.valueOf(inputNumber) : convertedInput.toString();
    }

    private String divisibleConversion(int inputNumber) {
        return DIVISION_CONVERTER_RULES.keySet()
                .stream()
                .filter(divisor -> inputNumber % divisor == 0)
                .map(DIVISION_CONVERTER_RULES::get)
                .collect(Collectors.joining());
    }

    private String containConversion(int inputNumber) {
        String numberToString = String.valueOf(inputNumber);

        return numberToString.chars()
                .filter(x -> CONTAIN_CONVERTER_RULES.containsKey(getNumericValue(x)))
                .mapToObj(x -> CONTAIN_CONVERTER_RULES.get(getNumericValue(x)))
                .collect(Collectors.joining());
    }
}

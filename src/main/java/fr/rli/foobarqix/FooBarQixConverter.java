package fr.rli.foobarqix;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Character.getNumericValue;
import static java.util.Map.entry;

public class FooBarQixConverter {

    private static final Map<Integer, String> DIVISION_RULES;
    private static final Map<Integer, String> CONTAIN_RULES;

    static {
        Map<Integer, String> divisionConverterMap = new LinkedHashMap<>();
        divisionConverterMap.put(3, "Foo");
        divisionConverterMap.put(5, "Bar");
        DIVISION_RULES = Collections.unmodifiableMap(divisionConverterMap);

        CONTAIN_RULES = Map.ofEntries(
                entry(3, "Foo"),
                entry(5, "Bar"),
                entry(7, "Qix"));
    }

    public String convert(int inputNumber) {
        StringBuilder convertedInput = new StringBuilder()
                .append(divisibleConversion(inputNumber))
                .append(containingConversion(inputNumber));

        return String.valueOf(convertedInput.length() == 0 ? inputNumber : convertedInput);
    }

    private String divisibleConversion(int inputNumber) {
        return DIVISION_RULES.keySet().stream()
                .filter(divisor -> inputNumber % divisor == 0)
                .map(DIVISION_RULES::get)
                .collect(Collectors.joining());
    }

    private String containingConversion(int inputNumber) {
        return String.valueOf(inputNumber)
                .chars()
                .mapToObj(x -> CONTAIN_RULES.getOrDefault(getNumericValue(x), ""))
                .collect(Collectors.joining());
    }

}

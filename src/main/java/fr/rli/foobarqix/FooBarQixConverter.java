package fr.rli.foobarqix;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";
    public static final String FIVE_AS_STRING = "Bar";
    public static final String SEVEN_AS_STRING = "Qix";

    public String convert(int inputNumber) {
        StringBuilder convertedInput = new StringBuilder();

        divisibleConversion(inputNumber, convertedInput);
        containConversion(inputNumber, convertedInput);

        return convertedInput.length() == 0 ? String.valueOf(inputNumber) : convertedInput.toString();
    }

    private void divisibleConversion(int inputNumber, StringBuilder convertedInput) {
        if (inputNumber % 3 == 0) {
            convertedInput.append(THREE_AS_STRING);
        }

        if (inputNumber % 5 == 0) {
            convertedInput.append(FIVE_AS_STRING);
        }
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

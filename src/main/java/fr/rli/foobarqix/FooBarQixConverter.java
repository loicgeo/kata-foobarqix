package fr.rli.foobarqix;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";
    public static final String FIVE_AS_STRING = "Bar";

    public String convert(int inputNumber) {
        StringBuilder convertedInput = new StringBuilder();

        if (inputNumber % 3 == 0) {
            convertedInput.append(THREE_AS_STRING);
        }

        if (inputNumber % 5 == 0) {
            convertedInput.append(FIVE_AS_STRING);
        }

        String inputToString = String.valueOf(inputNumber);

        for (Character inputDigit :inputToString.toCharArray()){
            if (inputDigit == '3') {
                convertedInput.append(THREE_AS_STRING);
            }
        }

        return convertedInput.length() == 0 ? String.valueOf(inputNumber) : convertedInput.toString();
    }
}

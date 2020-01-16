package fr.rli.foobarqix;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";
    public static final String FIVE_AS_STRING = "Bar";

    public String convert(int inputNumber) {
        StringBuilder convertedNumber = new StringBuilder();

        if (inputNumber % 3 == 0){
            convertedNumber.append(THREE_AS_STRING);
        }

        if (inputNumber % 5 == 0){
            convertedNumber.append(FIVE_AS_STRING);
        }

        return convertedNumber.length() == 0 ? String.valueOf(inputNumber) : convertedNumber.toString();
    }
}

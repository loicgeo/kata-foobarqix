package fr.rli.foobarqix;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";
    public static final String FIVE_AS_STRING = "Bar";

    public String convert(int inputNumber) {

        if (inputNumber % 3 == 0){
            return THREE_AS_STRING;
        }

        if (inputNumber % 5 == 0){
            return FIVE_AS_STRING;
        }

        return String.valueOf(inputNumber);
    }
}

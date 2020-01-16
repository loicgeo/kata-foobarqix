package fr.rli.foobarqix;

public class FooBarQixConverter {

    public static final String THREE_AS_STRING = "Foo";

    public String convert(int inputNumber) {

        if (inputNumber % 3 == 0){
            return THREE_AS_STRING;
        }

        return String.valueOf(inputNumber);
    }
}

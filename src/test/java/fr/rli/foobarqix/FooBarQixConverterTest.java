package fr.rli.foobarqix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixConverterTest {

    private static FooBarQixConverter fbqConverter;

    @BeforeAll
    static void setUp() {
        fbqConverter = new FooBarQixConverter();
    }

    @Test
    public void should_return_input_number_as_string() {
        assertEquals("1", fbqConverter.convert(1));
    }

    @Test
    public void should_convert_input_number_to_foo_when_divisible_by_3() {
        assertEquals("Foo", fbqConverter.convert(3));
    }

    @Test
    public void should_convert_input_number_to_foo_when_divisible_by_5() {
        assertEquals("Bar", fbqConverter.convert(5));
    }

    @Test
    public void should_convert_input_number_to_foo_when_divisible_by_3_and_5() {
        assertEquals("FooBar", fbqConverter.convert(5*3*3*5));
    }
}

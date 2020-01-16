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
    public void should_convert_input_number_to_foo_when_divible_by_3() {
        assertEquals("Foo", fbqConverter.convert(3));
    }


}

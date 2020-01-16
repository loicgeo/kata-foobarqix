package fr.rli.foobarqix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FooBarQixConverterTest {

    private static FooBarQixConverter fbqConverter;

    @BeforeAll
    static void setUp() {
        fbqConverter = new FooBarQixConverter();
    }

    private static Stream<Arguments> provide_number_for_foobarqix_conversion() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "Foo"),
                Arguments.of(5, "Bar"),
                Arguments.of(15, "FooBar")
        );
    }

    @ParameterizedTest
    @MethodSource("provide_number_for_foobarqix_conversion")
    public void should_apply_foobarqix_conversion_for_input_number(int input, String expected) {
        Assertions.assertEquals(expected, fbqConverter.convert(input));
    }
}

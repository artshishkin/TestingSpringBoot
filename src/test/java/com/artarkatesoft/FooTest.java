package com.artarkatesoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When testing Foo.class")
class FooTest {

    @Test
    @DisplayName("and getting bar")
    void getBar() {
        Foo foo = new Foo();

        assertEquals("FooBar", foo.bar(),"must be correct FooBar");
    }
}

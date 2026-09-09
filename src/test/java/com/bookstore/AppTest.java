package com.bookstore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApp() {
        assertEquals("Online Book Store", App.getMessage());
    }
}

package com.keerthika;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        System.out.println("Checking assertions...");
        // Assert equals: Checks if the two values are equal
        assertEquals(5, 2 + 3);

        // Assert true: Checks if the condition is true
        assertTrue(5 > 3);

        // Assert false: Checks if the condition is false
        assertFalse(5 < 3);

        // Assert null: Checks if the object is null
        assertNull(null);

        // Assert not null: Checks if the object is NOT null
        assertNotNull(new Object());
    }
}
package com.keerthika;

import org.junit.*;
import static org.junit.Assert.*;

public class AAATest {

    @Before
    public void setUp() {
        System.out.println(">> SETUP: Preparing the test environment before the test starts.");
    }

    @After
    public void tearDown() {
        System.out.println(">> TEARDOWN: Cleaning up the test environment after the test finishes.");
    }

    @Test
    public void testWithAAA() {
        // 1. Arrange: Prepare the input data
        int a = 10;
        int b = 20;
        System.out.println(">> ARRANGE: Variables initialized: a=" + a + ", b=" + b);

        // 2. Act: Call the operation
        int sum = a + b;
        System.out.println(">> ACT: Performing addition: " + a + " + " + b + " = " + sum);

        // 3. Assert: Verify the result
        assertEquals(30, sum);
        System.out.println(">> ASSERT: Verification successful! Expected 30, Got " + sum);
    }
}
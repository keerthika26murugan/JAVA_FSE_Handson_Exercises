package com.keerthika;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    private ExternalApi mockApi;

    @Test
    public void testVerifyInteraction() {
        // 1. Arrange: Create service with the mock
        MyService service = new MyService(mockApi);

        // 2. Act: Call the method
        service.fetchData();

        // 3. Assert/Verify: Check if getData() was called on the mock
        verify(mockApi).getData();
        
        System.out.println("--- Verification Passed: getData() was called! ---");
    }
}
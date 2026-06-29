import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    // Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }

    // Exercise 3: Argument Matching
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData(anyString())).thenReturn("Specific Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData("123");

        assertEquals("Specific Data", result);
        verify(mockApi).getData(eq("123"));
    }

    // Exercise 4: Handling Void Methods
    @Test
    public void testHandlingVoidMethods() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // doNothing() is the default for void methods, but we can explicitly stub it
        doNothing().when(mockApi).performAction();

        MyService service = new MyService(mockApi);
        service.executeAction();

        verify(mockApi).performAction();
    }

    // Exercise 5: Mocking and Stubbing with Multiple Returns
    @Test
    public void testMockingAndStubbingWithMultipleReturns() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call");

        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
    }

    // Exercise 6: Verifying Interaction Order
    @Test
    public void testVerifyingInteractionOrder() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.executeSteps();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).stepOne();
        inOrder.verify(mockApi).stepTwo();
    }

    // Exercise 7: Handling Void Methods with Exceptions
    @Test
    public void testHandlingVoidMethodsWithExceptions() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new RuntimeException("Exception occurred")).when(mockApi).performActionWithException();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> service.executeActionWithException());
        verify(mockApi).performActionWithException();
    }
}

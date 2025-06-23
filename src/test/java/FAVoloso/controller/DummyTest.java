package FAVoloso.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class DummyTest {
    @Test
    public void dummyTest() {
        // Create an object to test
        List<String> dummyList = new ArrayList()<>();
        // Optional: initialize it with some values if needed
        dummyList.add("Test Item 1");
        // Invoke methods on the object
        int size = dummyList.size();
        // Assert the expected outcomes
        assertEquals(1, size);
    }
}

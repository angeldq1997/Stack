// StackTest.java
package ed.dam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void stackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
}
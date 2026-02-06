// StackTest.java
package ed.dam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void initiateStack(){
        this.stack = new Stack();
    }

    @Test
    void whenCreatingStack_IsEmpty() {
        assertTrue(this.stack.isEmpty());
    }

    @Test
    void whenStackSomething_StackIsNotEmpty(){
        stack.stacking(0);
        assertFalse(this.stack.isEmpty());
    }

    @Test
    void whenUnstackingStackIsEmpty_throwsExceptionUnderflow(){
        Exception exception = assertThrows(Stack.UnderflowException.class, () -> {
            stack.unstacking();
        });
    }

    @Test
    void whenStackingAndUnstacking_stackIsEmpty(){
        stack.stacking(0);
        stack.unstacking();
        assertTrue(stack.isEmpty());
    }
}
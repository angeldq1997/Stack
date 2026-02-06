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
    void whenStackingTwiceAndUnstackingOnce_stackIsNotEmpty(){
        this.stack.stacking(1);
        this.stack.stacking(2);
        this.stack.unstacking();
        assertFalse(this.stack.isEmpty());
    }

    @Test
    void whenStackSomething_StackIsNotEmpty(){
        this.stack.stacking(0);
        assertFalse(this.stack.isEmpty());
    }

    @Test
    void whenUnstackingStackIsEmpty_throwsExceptionUnderflow(){
        Exception exception = assertThrows(Stack.UnderflowException.class, () -> {
            this.stack.unstacking();
        });
    }

    @Test
    void whenStackingAndUnstacking_stackIsEmpty(){
        this.stack.stacking(0);
        this.stack.unstacking();
        assertTrue(this.stack.isEmpty());
    }

    @Test
    void whenStackingXYUnstacking_getXThenY(){
        stack.stacking(0);
        assertEquals(0, stack.unstacking());
        stack.stacking(99);
        assertEquals(99, stack.unstacking());
    }

    @Test
    void whenStackingXThenY_unstackingYThenX(){
        stack.stacking(0);
        stack.stacking(99);
        assertEquals(99, stack.unstacking());
        assertEquals(0, stack.unstacking());
    }

    @Test
    void whenStackingTwice_stackSizeIsTwo(){
        stack.stacking(1);
        stack.stacking(5);
        assertEquals(2, stack.getNumberElements());
    }

    @Test
    void whenStackingThrice_stackSizeIsThree(){
        stack.stacking(1);
        stack.stacking(5);
        stack.stacking(20);
        assertEquals(3, stack.getNumberElements());
    }

    @Test
    void whenStackHasLimitTwo_stackingThriceThrowsExceptionOverflow(){
        stack.stacking(1);
        stack.stacking(3);
        Exception exception = assertThrows( Stack.OverflowExcepcion.class, () -> {
            stack.stacking(30);
        });
    }
}
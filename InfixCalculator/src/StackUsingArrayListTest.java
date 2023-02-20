import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingArrayListTest {

    private Stack<String> stack;

    @Test
    void PushandPop() {
        stack = new StackUsingArrayList<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals("c", stack.pull());
        assertEquals("b", stack.pull());
        assertEquals("a", stack.pull());
    }

    @Test
    void peek() {
        stack = new StackUsingArrayList<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals("c", stack.peek());
        assertEquals("c", stack.peek());
    }

    @Test
    void count() {
        stack = new StackUsingArrayList<String>();
        assertEquals(0, stack.count());

        stack.push("a");
        assertEquals(1, stack.count());

        stack.push("b");
        assertEquals(2, stack.count());

        stack.pull();
        assertEquals(1, stack.count());

        stack.pull();
        assertEquals(0, stack.count());
    }

    @Test
    void isEmpty() {
        stack = new StackUsingArrayList<String>();
        assertTrue(stack.isEmpty());

        stack.push("a");
        assertFalse(stack.isEmpty());

        stack.pull();
        assertTrue(stack.isEmpty());
    }
}
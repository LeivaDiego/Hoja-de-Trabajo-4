import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingVectorTest {

    @Test
    void push() {
        StackUsingVector<Integer> stack = new StackUsingVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.count());
    }

    @Test
    void pull() {
        StackUsingVector<Integer> stack = new StackUsingVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pull().intValue());
        assertEquals(2, stack.pull().intValue());
        assertEquals(1, stack.pull().intValue());
        assertTrue(stack.isEmpty());
    }

    @Test
    void peek() {
        StackUsingVector<Integer> stack = new StackUsingVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek().intValue());
        assertEquals(3, stack.peek().intValue());
        assertEquals(3, stack.count());
    }

    @Test
    void count() {
        StackUsingVector<Integer> stack = new StackUsingVector<>();
        assertEquals(0, stack.count());
        stack.push(1);
        assertEquals(1, stack.count());
        stack.push(2);
        assertEquals(2, stack.count());
        stack.pull();
        assertEquals(1, stack.count());
    }

    @Test
    void isEmpty() {
        StackUsingVector<Integer> stack = new StackUsingVector<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pull();
        assertTrue(stack.isEmpty());
    }
}
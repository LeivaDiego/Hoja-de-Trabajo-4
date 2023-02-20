import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingListTest {

    @Test
    void pushWithSingleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(1);
        stack.push(1);
        stack.push(2);
        assertEquals(2,stack.count());
    }

    @Test
    void pullWithSingleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(1);
        stack.push(1);
        int popped = stack.pull();
        assertEquals(0, stack.count());
        assertEquals(1, popped);
    }

    @Test
    void peekWithSingleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(1);
        stack.push(1);
        int peeked = stack.peek();
        assertEquals(1, stack.count());
        assertEquals(1, peeked);
    }

    @Test
    void countWithSingleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(1);
        assertEquals(0, stack.count());
        stack.push(1);
        assertEquals(1, stack.count());
        stack.push(2);
        assertEquals(2, stack.count());
        stack.pull();
        assertEquals(1, stack.count());
    }

    @Test
    void isEmptyWithSingleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(1);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void pushWithDoubleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(2);
        stack.push(1);
        stack.push(2);
        assertEquals(2,stack.count());
    }

    @Test
    void pullWithDoubleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(2);
        stack.push(1);
        int popped = stack.pull();
        assertEquals(0, stack.count());
        assertEquals(1, popped);
    }

    @Test
    void peekWithDoubleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(2);
        stack.push(1);
        int peeked = stack.peek();
        assertEquals(1, stack.count());
        assertEquals(1, peeked);
    }

    @Test
    void countWithDoubleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(2);
        assertEquals(0, stack.count());
        stack.push(1);
        assertEquals(1, stack.count());
        stack.push(2);
        assertEquals(2, stack.count());
        stack.pull();
        assertEquals(1, stack.count());
    }

    @Test
    void isEmptyWithDoubleLinkedList() {
        StackUsingList<Integer> stack = new StackUsingList<>(2);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
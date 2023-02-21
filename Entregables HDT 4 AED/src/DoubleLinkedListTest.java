import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test unitarios para la lista doblemente encadenada
 * @author diego leiva
 * Referencia malonso-uvg
 */
class DoubleLinkedListTest {

    @Test
    void insertAtStart() {
        DoubleLinkedList<Integer> testList = new DoubleLinkedList<Integer>();
        testList.InsertAtStart(3);
        assertEquals(testList.Get(0), 3);
    }

    @Test
    void insertAtEnd() {
        DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
        testList.InsertAtEnd("Hola");
        assertEquals(testList.Get(0), "Hola");
    }

    @Test
    void deleteAtStart() {
        DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
        testList.InsertAtStart("Hola");
        assertEquals(testList.Count(), 1);
        assertEquals(testList.DeleteAtStart(), "Hola");
        assertEquals(testList.Count(), 0);
    }

}
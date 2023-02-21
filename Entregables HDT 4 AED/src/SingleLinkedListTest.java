import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test unitarios para la lista simplemente encadenada
 * @author diego leiva
 * Referencia malonso-uvg
 */
class SingleLinkedListTest {

    @Test
    void insertAtStart() {
        SingleLinkedList<Integer> testList = new SingleLinkedList<Integer>();
        testList.InsertAtStart(3);
        assertEquals(testList.Get(0), 3);
    }

    @Test
    void insertAtEnd() {
        SingleLinkedList<String> testList = new SingleLinkedList<String>();
        testList.InsertAtEnd("default");
        assertEquals(testList.Get(0), "default");
    }
}
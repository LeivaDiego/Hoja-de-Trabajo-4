/**
 * Clase con los metodos de nodos para implementar en las listas
 * @author diego leiva
 * @param <T> dato generico
 * Referencia de malonso-uvg
 */
public class Node<T> {
    private T value;        //valor del dato generico
    private Node<T> next;   //valor del siguiente nodo

    public Node(T value) {
        this.setValue(value);
    }

    /**
     * Obtiene el valor del dato
     * @return value, el valor del dato
     */
    public T getValue() {
        return value;
    }

    /**
     * Establece el valor del dato
     * @param value el valor a establecer
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Obtiene el valor del siguiente dato del nodo
     * @return next, el valor del siguiente nodo
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Establece el valor del siguiente nodo
     * @param next, el valor del siguiente nodo a establecer
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

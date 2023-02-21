/**
 * Clase con los metodos de doble nodo para implementar en listas
 * @author diego leiva
 * @param <T> dato generico
 * Referencia de malonso-uvg
 */
public class DoubleNode<T> {
    private T value;                    //el valor del nodo
    private DoubleNode<T> next;         //el valor del siguiente nodo
    private DoubleNode<T> previous;     //el valor del nodo anterior

    /**
     * Constructor
     * @param value el valor inicial
     */
    public DoubleNode(T value) {
        this.setValue(value);
    }

    /**
     * Obtiene el valor del nodo actual
     * @return value, el valor del nodo
     */
    public T getValue() {
        return value;
    }

    /**
     * Establece el valor del nodo actual
     * @param value, el valor a establecer
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Obtiene el valor del siguiente nodo
     * @return next, el valor del nodo siguiente
     */
    public DoubleNode<T> getNext() {
        return next;
    }

    /**
     * Establece el valor del siguiente nodo
     * @param next, el valor a establecer
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    /**
     * Obtiene el valor del nodo anterior
     * @return previous, el valor anterior
     */
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    /**
     * Establece el valor del nodo anterior
     * @param previous, el valor a establecer
     */
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }
}

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Clase con la implementacion de una pila a partir del uso de
 * un vector
 * @author diego leiva
 * @param <T> dato generico
 */
public class StackUsingVector<T> extends Stack<T> {
    private Vector<T> vector;

    public StackUsingVector(){
        vector = new Vector<>();
    }


    @Override
    public void push(T value) {
        vector.add(value);
    }

    @Override
    public T pull() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return vector.remove(count() - 1);
    }

    @Override
    public T peek() {
        return vector.lastElement();
    }

    @Override
    public int count() {
        return vector.size();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
}

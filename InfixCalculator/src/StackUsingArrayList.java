import java.util.ArrayList;

/**
 * Clase con la implementacion de una pila a partir del uso de un
 * arrayList
 * @author diego leiva
 * @param <T> dato generico
 */
public class StackUsingArrayList<T> extends Stack<T>{

    private ArrayList<T> arrayList;

    public StackUsingArrayList(){
        arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T value) {
        arrayList.add(0,value);
    }

    @Override
    public T pull() {
        return arrayList.remove(0);
    }

    @Override
    public T peek() {
        return arrayList.get(0);
    }

    @Override
    public int count() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}

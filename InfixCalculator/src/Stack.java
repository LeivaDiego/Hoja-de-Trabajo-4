/**
 * Clase abstracta para la implementacion de las pilas
 * @author diego leiva
 * @param <T> dato generico
 */
public abstract class Stack<T> implements IStack<T>{
    public abstract void push(T value);

    public abstract T pull();

    public abstract T peek();

    public abstract int count();

    public abstract boolean isEmpty();
}

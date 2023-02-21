/**
 * Interfaz para las listas
 * @param <T> dato generico
 * @author diego leiva
 * Referencia de malonso-uvg
 */
public interface IList<T> {
    void InsertAtStart(T value);

    void InsertAtEnd(T value);

    void Insert(T value, int index);

    T Delete(int index);

    T DeleteAtStart();

    T DeleteAtEnd();

    T Get(int index);

    boolean IsEmpty();

    int Count();
}

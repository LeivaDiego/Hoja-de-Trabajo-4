/**
 * Clase abstacta para la implementacion de listas
 * @author diego leiva
 * @param <T> dato generico
 */
public abstract class List<T> implements IList<T> {
    private int count;          //contador
    private Node<T> start;      //nodo de inicio
    private Node<T> end;        //ultimo nodo

    public abstract void InsertAtEnd(T value);

    public abstract void InsertAtStart(T value);

    public abstract T DeleteAtEnd();

    public abstract T DeleteAtStart();

    public T Get(int index){
        if (!IsEmpty())
        {
            if (index == 0) //Si se necesita el primer nodo
                return start.getValue();
            else if (index == (Count() - 1))
                return end.getValue();
            else if ((index > 0) && (index < (Count() - 1)))
            {
                Node<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                    return temp.getValue();
                else
                    return null;
            }
            else
                return null;
        }

        return null;
    }
    public boolean IsEmpty() {
        return count == 0;
    }

    public int Count() {
        return count;
    }
}

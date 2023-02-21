/**
 * @author diego leiva
 * Clase con los metodos para una lista doblemente encadenada
 * @param <T> dato generico
 */
public class DoubleLinkedList<T> extends List<T>{
    private DoubleNode<T> start;    //valor del nodo del inicio
    private DoubleNode<T> end;      //valor del nodo del final
    private int count;              //contador

    /**
     * Constructor de la lista doblemente encadenada
     */
    public DoubleLinkedList() {
        start = null;
        end = null;
        count = 0;
    }


    /**
     * Metodo que inserta el valor al inicio de la lista
     * @param value el valor a insertar
     */
    @Override
    public void InsertAtStart(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setNext(start);
            start.setPrevious(newNode);
            newNode.setPrevious(end);
            end.setNext(newNode);
            start = newNode;
        }

        count++;
    }

    /**
     * Metodo que inserta el valor hasta el final de la lista
     * @param value, el valor a insertar
     */
    @Override
    public void InsertAtEnd(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setPrevious(end);
            newNode.setNext(start);
            start.setPrevious(newNode);
            end.setNext(newNode);
            end = newNode;
        }

        count++;
    }

    /**
     * Metodo que Inserta un valor en el indice indicado
     * @param value, el valor a insertar
     * @param index, el indice
     */
    @Override
    public void Insert(T value, int index) {
        if (IsEmpty()) //Si la lista esta vacia, inserta en el inicio
        {
            InsertAtStart(value);
        }
        else
        {
            if (index >= Count()) //Si el indice es mayor o igual que el contador entonces insertar al final
            {
                InsertAtEnd(value);
            }
            else if (index == 0) //Si el indice a insertar es 0 y la lista no esta vacia
            {
                InsertAtStart((T) value);
            }
            else if ((index > 0) && (index < Count())) //Indice entre 1 (segundo elemento) y Count() -1 antes que el ultimo
            {
                DoubleNode<T> newNode = new DoubleNode<T>(value);
                DoubleNode<T> temp = start;
                int i = 0;

                //Busca la posicion de nodo donde sera insertado
                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }

                //Haciendo la incersion
                newNode.setNext(temp);
                assert temp != null;
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }
    }

    /**
     * Metodo que borra el valor
     * @param index el indice
     * @return null
     */
    @Override
    public T Delete(int index) {
        return null;
    }

    /**
     * Metodo que borra el valor del inicio
     * @return null
     */
    @Override
    public T DeleteAtStart() {
        if (!IsEmpty()) {

            if (Count() == 1) {
                DoubleNode<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            } else {
                DoubleNode<T> temp = start;
                end.setNext(temp.getNext());
                temp.getNext().setPrevious(end);
                start = temp.getNext();
                count--;
                return temp.getValue();
            }

        } else {
            return null;
        }
    }

    @Override
    public T DeleteAtEnd() {
        return null;
    }

    @Override
    public T Get(int index) {
        if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNode<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;

    }

    @Override
    public boolean IsEmpty() {
        return count == 0;
    }

    @Override
    public int Count() {
        return count;
    }
}

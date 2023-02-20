public class SingleLinkedList<T> implements IList{
    private int count;
    private Node<T> start;
    private Node<T> end;


    @Override
    public void InsertAtStart(Object value) {
        Node<T> newNode = new Node<T>((T) value);

        if (IsEmpty())
        {
            start = newNode;
            end = newNode;
        }
        else
        {
            newNode.setNext(start);
            start = newNode;
        }
        count++;
    }

    @Override
    public void InsertAtEnd(Object value) {
        Node<T> newNode = new Node<T>((T) value);

        if (IsEmpty())
        {
            start = newNode;
            end = newNode;
        }
        else {
            end.setNext(newNode);
            end = newNode;
        }

        count++;
    }

    @Override
    public void Insert(Object value, int index) {
        if (IsEmpty()) //Si la lista esta vacia, entonces se inserta al inicio
        {
            InsertAtStart(value);
        }
        else
        {
            if (index >= Count()) //Si el indice es mayor o igual al contador entonces se inserta al final
            {
                InsertAtEnd(value);
            }
            else if (index == 0) //Si el indice a insertar es 0 y la lista no esta vacia
            {
                InsertAtStart(value);
            }
            else if ((index > 0) && (index < Count())) //Un indice entre 1 (el segundo elemento) y Count() -1 el anterior
            {
                Node<T> newNode = new Node<T>((T) value);
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();
                int i = 1;

                //Busca la posicion donde se insertara el nodo
                while ((temp != null) && (i < index)) {
                    pretemp = temp;
                    temp = temp.getNext();
                    i++;
                }

                //Haciendo la insercion
                newNode.setNext(temp);
                pretemp.setNext(newNode);
                count++;
            }
        }
    }

    @Override
    public Object Delete(int index) {
        if (index == 0)
        {
            return DeleteAtStart();
        }
        else if (index == (Count() - 1))
        {
            return DeleteAtEnd();
        }
        else if ((index > 0) && (index < (Count() - 1)))
        {
            Node<T> pretemp = start;
            Node<T> temp = start.getNext();
            int i = 1;

            //Busca la posicion donde se insertara el nodo
            while ((temp != null) && (i < (Count() - 1)))
            {
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }

            //Borra el nodo
            pretemp.setNext(temp.getNext());
            count--;
            return temp.getValue();
        }
        else
        {
            return null;
        }
    }

    @Override
    public Object DeleteAtStart() {
        if (!IsEmpty())
        {
            Node<T> temp = start;
            start = start.getNext();
            count--;
            return temp.getValue();
        }

        return null;
    }

    @Override
    public Object DeleteAtEnd() {
        if (!IsEmpty())
        {

            if (Count() == 1) //Solo un nodo y luego se borra
            {
                Node<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            }
            else
            {
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();

                //Busca la posicion donde se insertara el nodo
                while (temp != null)
                {
                    pretemp = temp;
                    temp = temp.getNext();
                }

                //Borra el nodo
                end = pretemp;
                end.setNext(null);
                count--;
                return temp.getValue();
            }

        }

        return null;
    }

    @Override
    public Object Get(int index) {
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
                Node<T> temp = start;
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

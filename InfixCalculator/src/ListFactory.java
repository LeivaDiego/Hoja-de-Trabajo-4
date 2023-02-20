public class ListFactory<T> {
    public List<T> CreateList(int listType){
        List<T> list = null;
        if (listType == 1) list = new SingleLinkedList<>();
        else if (listType == 2) list = new DoubleLinkedList<>();
        else throw new IllegalArgumentException("Implementacion de lista no valida");
        return list;
    }
}

public class StackUsingList<T> extends Stack<T> {

    private List<T> list = null;
    public StackUsingList(int listType){
        this.list = new ListFactory<T>().CreateList(listType);
    }
    @Override
    public void push(T value) {
        list.InsertAtStart(value);
    }

    @Override
    public T pull() {
        return list.DeleteAtStart();
    }

    @Override
    public T peek() {
        return list.Get(0);
    }

    @Override
    public int count() {
        return list.Count();
    }

    @Override
    public boolean isEmpty() {
        return list.IsEmpty();
    }
}

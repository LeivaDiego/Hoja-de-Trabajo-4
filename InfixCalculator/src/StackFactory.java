public class StackFactory<T> {

    public Stack<T> CreateStack(int stackType, int listType){
        Stack<T> stack = null;
        switch (stackType){
            case 1:
                stack = new StackUsingArrayList<>();
            case 2:
                stack = new StackUsingVector<>();
            case 3:
                stack = new StackUsingList<T>(listType);
            default:
                throw new IllegalArgumentException("La implementacion no es valida");
        }
    }
}

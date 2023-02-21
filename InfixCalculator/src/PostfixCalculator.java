import java.util.ArrayList;

/**
 * Clase encargada de realizar el calculo de la
 * expresion postfix con alguna de las implementaciones del stack
 * @param <T>
 */
public class PostfixCalculator<T> implements IPostfixCalculator<T>{
    private int listType;
    private int stackType;
    private StackFactory<Integer> stackFactory;

    public PostfixCalculator(int s, int l){
        this.stackFactory = new StackFactory<Integer>();
        this.listType = l;
        this.stackType = s;
    }
    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws SinglentonException {
        Stack<Integer> stack = stackFactory.CreateStack(stackType,listType);
        for (T s : postfix_expression) {
            if (isNumber((String) s)) {
                stack.push(Integer.parseInt((String) s));
            } else {
                int num2 = stack.pull();
                int num1 = stack.pull();
                int result = 0;
                switch ((String)s) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + s);
                }
                stack.push(result);
            }
        }

        return stack.pull();
    }

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

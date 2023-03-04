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
    private static PostfixCalculator instance;

    /**
     * Constructor de la calculadora postfix
     * @param s, el tipo de pila a implementar
     * @param l, el tipo de lista a implementar
     */
    private PostfixCalculator(int s, int l){
        this.stackFactory = new StackFactory<Integer>();
        this.listType = l;
        this.stackType = s;
    }

    /**
     * Metodo estático para obtener la única instancia de PostfixCalculator
     * @param s, el tipo de pila a implementar
     * @param l, el tipo de lista a implementar
     * @return la instancia de PostfixCalculator
     */
    public static synchronized PostfixCalculator getInstance(int s, int l) {
        if (instance == null) {
            instance = new PostfixCalculator(s, l);
        }
        return instance;
    }

    /**
     * Metodo encargado de realizar la expresion postfix
     * empleando el patron de diseño factory para seleccionar
     * la implementacion de la pila
     * @param postfix_expression un arraylist generico
     * @return  El valor final de la operacion
     * @throws SinglentonException
     */
    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws SinglentonException {
        Stack<Integer> stack = stackFactory.CreateStack(stackType,listType);
        for (T s : postfix_expression) {
            if (isNumber((String) s)) {
                stack.push(Integer.parseInt((String) s));
            } else {
                int num1 = stack.pull();
                int num2 = stack.pull();
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

    /**
     * Metodo que revisa si el caracter del stack
     * es un numer
     * @param s el string a evaluar
     * @return  verdadero o falso si es o no numero
     */
    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

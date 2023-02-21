import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Clase con los metodos encargados de convertir
 * la expresion infix del archivo de texto a
 * una expresion postfix implementando el algoritmo
 * Shunting Yard
 * @author diego leiva
 * Referencia de https://www.geeksforgeeks.org/convert-infix-expression-to-postfix-expression/
 */
public class InfixPostfixConverter {
    FileManager fileManager = new FileManager();

    /**
     * Metodo encargado de evaluar la precedencia de los operadores
     * @param ch el caracter a evaluar
     * @return el valor del orden
     */
    public int Precedence(char ch)
    {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    /**
     * Metodo principal que convierte la expresion infix
     * a expresion postfix
     * @param exp la expresion a evaluar
     * @return la expresion postfix
     */
    public String infixToPostfix(String exp)
    {
        //Instancia de un String nuevo
        String result = new String("");

        // Instancia de una pila nueva
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // Si el caracter encontrado es un operando, entonces lo agrega al output
            if (Character.isLetterOrDigit(c))
                result += c;

                // Si el caracter encontrado es un  '(' entonces meterlo a la pila
            else if (c == '(')
                stack.push(c);

                //Si el caracter es un ')' entonces sacar y agregar al outpur de la pila hasta que se encuentre un '('
            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }

                stack.pop();
            }
            else //Si se encuentra un operador
            {
                while (!stack.isEmpty()
                        && Precedence(c) <= Precedence(stack.peek())) {

                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        //Saca todos los operadores del stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Expresion invalida";
            result += stack.peek();
            stack.pop();
        }

        return result;
    }

}

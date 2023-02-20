/**
 * @author diego leiva
 * Interfaz para las operaciones postfix
 * @param <T> dato generico
 * Referencia interfaz creada por la seccion 40 en la hoja de trabajo 2
 */
public interface IPostfixCalculator<T> {
    /**
     * Metodo de operaciones
     * @param postfix_expression un arraylist generico
     * @return un valor de tipo int con el resultado de la operacion
     * @throws Exception
     */
    public int Calculate(java.util.ArrayList<T> postfix_expression) throws Exception;
}

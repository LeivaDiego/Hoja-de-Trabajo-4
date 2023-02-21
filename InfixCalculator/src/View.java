/**
 * Clase que contiene los metodos para mostrar
 * los diferentes menus y mensajes en pantalla
 * @author diego leiva
 */
public class View {

    public void ImplementationMenu(){
        System.out.println("Bienvenido a la calculadora de expresiones INFIX");
        System.out.println("Seleccione una opcion para la implementacion de la pila\n");
        System.out.println("[1] ArrayList");
        System.out.println("[2] Vector");
        System.out.println("[3] Lista");
        System.out.println("[4] Salir\n");

    }
    public void ListMenu(){
        System.out.println("Seleccione una opcion para la implementacion de la lista\n");
        System.out.println("[1] Lista Simplemente encadenada");
        System.out.println("[2] Lista Doblemente encadenada\n");

    }

    public void Exit(){
        System.out.println("...");
        System.out.println("Ha salido del Programa");
    }

    public void Expressions(String infix, String postfix, int res){
        System.out.println("La expresion INFIX es: "+ infix);
        System.out.println("La expresion POSTFIX es: "+postfix);
        System.out.println("El resultado de la operacion es: "+res);
    }
}

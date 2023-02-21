import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        View view = new View();
        FileManager fileManager = new FileManager();
        InfixPostfixConverter infixPostfixConverter = new InfixPostfixConverter();
        int option = 0;
        int result = 0;
        String infixExp = fileManager.getInfixExpression("datos.txt");
        String postfixExp = infixPostfixConverter.infixToPostfix(infixExp);
        ArrayList<String> finalExpression = convertStringToList(postfixExp);
        while (option >4 || option <1) {
            view.ImplementationMenu();

            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debe ingresar solo un numero entero");
            }
            if (option < 1 || option > 4) {
                System.out.println("ERROR: Opcion invalida");
                continue;
            }
            switch (option){
                case 1:
                    System.out.println("Selecciono la implementacion con ArrayList");
                    PostfixCalculator postfixCalculatorArray = new PostfixCalculator<>(1, 1);
                    result = postfixCalculatorArray.Calculate(finalExpression);
                    view.Expressions(infixExp,postfixExp,result);
                    break;
                case 2:
                    System.out.println("Selecciono la implementacion con Vector");
                    PostfixCalculator postfixCalculatorVector = new PostfixCalculator<>(2, 1);
                    result = postfixCalculatorVector.Calculate(finalExpression);
                    view.Expressions(infixExp,postfixExp,result);
                    break;
                case 3:
                    System.out.println("Selecciono la implementacion con listas\n");
                    int type =0;
                    while (type>2 || type<1){
                        view.ListMenu();
                        try {
                            type = Integer.parseInt(input.nextLine());
                        }catch (NumberFormatException e){
                            System.out.println("ERROR: Debe ingresar solo un numero entero");
                        }
                        if (type < 1 || type >2){
                            System.out.println("ERROR: Opcion Invalida");
                            continue;
                        }
                        switch (type){
                            case 1:
                                System.out.println("Selecciono opcion de lista simplemente encadenada");
                                PostfixCalculator postfixCalculatorSingle = new PostfixCalculator<>(3, 1);
                                result = postfixCalculatorSingle.Calculate(finalExpression);
                                view.Expressions(infixExp,postfixExp,result);
                                break;
                            case 2:
                                System.out.println("Selecciono opcion de lista doblemente encadenada");
                                PostfixCalculator postfixCalculatorDouble = new PostfixCalculator<>(3, 2);
                                result = postfixCalculatorDouble.Calculate(finalExpression);
                                view.Expressions(infixExp,postfixExp,result);
                                break;
                        }
                    }
                    break;
                case 4:
                    view.Exit();
                    break;
            }
        }
    }

    /**
     * Metodo que transforma el string que contiene la expresion postfix
     * a un ArrayList de String simples para su uso en el Calculate()
     * @param inputString el string a convertir
     * @return  el ArrayList de strings de la expresion postfix
     */
    public static ArrayList<String> convertStringToList(String inputString) {
        // Crear una lista de caracteres a partir del String
        char[] charArray = inputString.toCharArray();

        // Crear un nuevo ArrayList de strings
        ArrayList<String> stringList = new ArrayList<String>();

        // Iterar sobre la lista de caracteres y agregar cada carácter como un nuevo string al ArrayList
        for (char c : charArray) {
            stringList.add(String.valueOf(c));
        }

        return stringList;
    }
}
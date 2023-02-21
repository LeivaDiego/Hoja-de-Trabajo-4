import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        View view = new View();
        int option = 0;
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
                    System.out.println("Selecciono la opcion 1");
                    break;
                case 2:
                    System.out.println("Selecciono la opcion 2");
                    break;
                case 3:
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
                                System.out.println("Selecciono opcion 1");
                                break;
                            case 2:
                                System.out.println("Selecciono opcion 2");
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
}
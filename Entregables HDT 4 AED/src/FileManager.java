import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase encargada de la lectura de un archivo de texto
 * y extraer la expresion infix contenida en el
 * @author diego leiva
 *
 */
public class FileManager {
    private String fileName = "datos.txt";  //nombre del archivo
    private String infixExpression;         //valor de la expresion infix

    /**
     * Metodo que retorna en un string la expresion infix contenida en el archivo de texto
     * @param file_name, nombre del archivo
     * @return infixExpression, la expresion infix del archivo
     * @throws IOException
     */
    public String getInfixExpression(String file_name) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        StringBuilder infixBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            infixBuilder.append(line).append("\n");
        }
        reader.close();
        this.infixExpression = infixBuilder.toString().trim();
        return infixExpression;
    }
}

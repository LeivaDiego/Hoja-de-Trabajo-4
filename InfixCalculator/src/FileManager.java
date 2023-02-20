import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    private String fileName = "datos.txt";
    private String infixExpression;

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

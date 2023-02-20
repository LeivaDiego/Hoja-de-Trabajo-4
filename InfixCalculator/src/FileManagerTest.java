import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void getInfixExpression() throws IOException {
        FileManager manager =  new FileManager();
        String expected = "(1+2)*9";
        String actual = manager.getInfixExpression("datos.txt");
        assertEquals(expected, actual);
    }
}
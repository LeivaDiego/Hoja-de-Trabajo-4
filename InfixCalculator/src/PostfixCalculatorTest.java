import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {

    @Test
    void calculateWithArrayList() {
        PostfixCalculator<String> calculator = new PostfixCalculator<String>(1,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithVector() {
        PostfixCalculator<String> calculator = new PostfixCalculator<String>(2,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithSingleList() {
        PostfixCalculator<String> calculator = new PostfixCalculator<String>(3,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithDoubleList() {
        PostfixCalculator<String> calculator = new PostfixCalculator<String>(3,2);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }
}
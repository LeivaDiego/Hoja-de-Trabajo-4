import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {

    @Test
    void calculateWithArrayList() {
        PostfixCalculator<String> calculator = PostfixCalculator.getInstance(1,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithVector() {
        PostfixCalculator<String> calculator = PostfixCalculator.getInstance(2,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithSingleList() {
        PostfixCalculator<String> calculator = PostfixCalculator.getInstance(3,1);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }

    @Test
    void calculateWithDoubleList() {
        PostfixCalculator<String> calculator = PostfixCalculator.getInstance(3,2);
        ArrayList<String> expression = new ArrayList<String>(Arrays.asList("1", "2", "+", "9", "*"));
        int result = calculator.Calculate(expression);
        assertEquals(27, result);
    }
}
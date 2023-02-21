import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixPostfixConverterTest {

    @Test
    void infixToPostfixWithBracket() {
        InfixPostfixConverter infixPostfixConverter = new InfixPostfixConverter();
        String infixExpression = "(1+2)*9";
        String expectedPostfix = "12+9*";
        String actualPostfix = infixPostfixConverter.infixToPostfix(infixExpression);
        assertEquals(expectedPostfix, actualPostfix);
    }

    @Test
    void infixToPostfixWithoutBracket() {
        InfixPostfixConverter infixPostfixConverter = new InfixPostfixConverter();
        String infixExpression = "1+2*9";
        String expectedPostfix = "129*+";
        String actualPostfix = infixPostfixConverter.infixToPostfix(infixExpression);
        assertEquals(expectedPostfix, actualPostfix);
    }
}
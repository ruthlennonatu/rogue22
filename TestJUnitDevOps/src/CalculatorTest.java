import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void threePlusThreeEqualsSix(){
        var calculator = new Calculator();
        assertEquals(6,calculator.add(3,3));
    }

}
package ie.atu;

import org.example.Calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    CalculatorTest myCalc;

    @Test
    void testAdd()
    {
        myCalc = new CalculatorTest();
        assertEquals(10,myCalc.add(4,6));

    }
    public int add(int firstNum, int secondNum)
    {
        int result= firstNum+secondNum;
        return result;
    }
    public int multi(int firstNum, int secondNum){
        int result= firstNum*secondNum;
        return result;
    }
    public int sub(int firstNum, int secondNum){
        int result= firstNum-secondNum;
        return result;
    }
    public int div(int firstNum, int secondNum){

        int result= firstNum/secondNum;
        return result;
    }
}

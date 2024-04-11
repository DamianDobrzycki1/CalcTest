package org.example;

public class Calc {

    Calc myCalculator;

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

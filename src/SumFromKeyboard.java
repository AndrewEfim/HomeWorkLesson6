package it.academy.homework;

public class SumFromKeyboard extends KeyboardOperation implements Operation{

    @Override
    public double execute(){
        System.out.println("Операция сложения: введите ваши числа");
        return  input.read()+input.read();
    }
}

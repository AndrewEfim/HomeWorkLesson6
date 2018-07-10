package it.academy.homework;

public class MinusFromKeyboard extends KeyboardOperation implements Operation {
    public double execute() {
        System.out.println("Операция вычитание: введите ваши числа");
        return input.read() - input.read();
    }
}

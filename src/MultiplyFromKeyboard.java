package it.academy.homework;

public class MultiplyFromKeyboard extends KeyboardOperation implements Operation {
    @Override
    public double execute() {
        System.out.println("Операция умножение: введите ваши числа");
        return input.read( ) * input.read( );
    }
}

package it.academy.homework;

public class SqrtFromKeyboard extends KeyboardOperation implements Operation {
    @Override
    public double execute() {
        System.out.println("Операция вычислениея квадратного корня введите ваше число" );
        return Math.sqrt(input.read());
    }
}

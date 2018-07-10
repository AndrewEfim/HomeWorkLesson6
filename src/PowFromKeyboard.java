package it.academy.homework;

public class PowFromKeyboard extends KeyboardOperation implements Operation{
    @Override
    public double execute() {
        System.out.println("Операция возведения числа в степень, введите ваши числа" );
        return Math.pow(input.read(),input.read());
    }
}

package it.academy.homework;

import java.io.IOException;

public class DivisionFromKeyboard extends KeyboardOperation implements Operation {
    @Override
    public double execute() {
        System.out.println("Операция деление: введите ваши числа");
            return input.read() / input.read();
    }
}

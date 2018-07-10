package it.academy.homework;

public class DivisionByNullException extends Exception {

    public DivisionByNullException(String m) {
        super("Деление на ноль");
    }
}

package it.academy.homework;

public class UnsuportedOperationException extends Exception {
    public UnsuportedOperationException(String message) {
        super("Такой операции нет");
    }
}

package it.academy.homework;

import java.util.Scanner;

public class KeyBoardInput implements OperandInput {
    private Scanner in = new Scanner(System.in);
    @Override
    public double read(){
        return in.nextDouble();
    }
}

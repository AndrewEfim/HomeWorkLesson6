package it.academy.homework;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Main {
    public static void main(String[] args) throws UnsuportedOperationException {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Виды операций : 1-сложение, 2-вычитание,3-деление,4-умножение,5-возведение в степень,6-корень квадратный.");
            MenuItems menuItems = new MenuItems( );
            Operation sum = menuItems.getOperation(in.nextInt( ));
            try {
                if (sum.execute()!=Infinity)
                System.out.println(sum.execute());
                else throw new DivisionByNullException("0");
            } catch (DivisionByNullException e) {
                e.printStackTrace();
            }
        } while (in.nextInt( ) != 7);
    }
}
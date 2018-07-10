package it.academy.homework;


import java.util.HashMap;
import java.util.Map;

public class MenuItems {
    private Map<Integer, Operation> items = new HashMap<>();

    {
        items.put(1, new SumFromKeyboard());
        items.put(2, new MinusFromKeyboard());
        items.put(3, new DivisionFromKeyboard());
        items.put(4, new MultiplyFromKeyboard());
        items.put(5, new PowFromKeyboard());
        items.put(6, new SqrtFromKeyboard());
    }

    public Operation getOperation(int i) throws UnsuportedOperationException {
        if (i<=8)
            return items.get(i);
        else throw new UnsuportedOperationException("Unsuported Operation");
    }
}
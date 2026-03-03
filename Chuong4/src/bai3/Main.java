package bai3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        int x = 4;
        int y = 7;

        System.out.println(x + " co phai so chan ko? " + isEven.test(x));
        System.out.println(y + " co phai so chan ko? " + isEven.test(y));
    }
}

package bai1;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> b == 0 ? 0 : a / b; // tránh chia 0

        int a = 20, b = 5;

        System.out.println("Cong: " + a + " + " + b + " = " + add.compute(a, b));
        System.out.println("Tru: " + a + " - " + b + " = " + sub.compute(a, b));
        System.out.println("Nhan: " + a + " * " + b + " = " + mul.compute(a, b));
        System.out.println("Chia: " + a + " / " + b + " = " + div.compute(a, b));
    }
}

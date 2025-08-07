package Ex1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số A");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào hệ số B");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào hệ số C");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        qe.getCalculator();
    }
}

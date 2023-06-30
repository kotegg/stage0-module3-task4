package school.mjc.stage0.module3.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a, b: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = (9*a*a-5*b+2+a-7) * ((a+b - 4*a*b)/2);
        System.out.println(c);
    }
}

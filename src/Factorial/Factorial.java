package Factorial;

import java.util.Scanner;

public class Factorial {

    public void setFact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.print("Factorial is:" + fact);
    }
}
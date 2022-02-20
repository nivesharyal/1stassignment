package GCD;

import java.util.Scanner;

public class GCD {
    public void HcfNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a= s.nextInt();
        System.out.println("Enter 2nd number");
        int b= s.nextInt();
        int hcf=0;
        for (int i=1;i<=a || i<=b;i++){
            if(a%i==0&&b%i==0)
                hcf=i;
        }
        System.out.println("The GCD of given number is "+hcf);

    }
}

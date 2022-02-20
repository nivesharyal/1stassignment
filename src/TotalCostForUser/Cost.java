package TotalCostForUser;

import java.util.Scanner;

public class Cost {


    public void TotalCost() {
        double discount;
        double price =0;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity ");
        int quantity=s.nextInt();
        price=quantity*100;
        if(price>1000){
            discount=0.1 * price;
            price=price-discount;
            System.out.println("The total cost for the user is "+price);

        }
        else{
            System.out.println("The total cost for the user is "+price);
        }

    }
}

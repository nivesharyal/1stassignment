package School;

import java.util.Scanner;
//Below 25-F
//25 to 40-E
//45 to 50-D
//50 to 60-C
//60 to 80-B
//Above 80-A

public class School {
    public void gradingSystem() {
        String yn;
        do {
            Scanner s=new Scanner(System.in);
            System.out.println(" Enter the marks scored ");
            double marks=s.nextDouble();
            if(marks>=80 && marks<=100){
                System.out.println(" Your grade is A ");
            }
            else if(marks>=60){
                System.out.println( "Your grade is B ");
            }
            else if(marks>=50){
                System.out.println(" Your grade is C ");
            }
            else if(marks>=45){
                System.out.println(" Your grade is D ");
            }
            else if(marks>=25){
                System.out.println(" Your grade is E ");
            }
            else{
                System.out.println(" Your grade is F");
            }
            System.out.println("Do you want to continue(Press y for Yes and n for No)");
            yn=s.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}
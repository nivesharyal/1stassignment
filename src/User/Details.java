package User;

import java.util.Scanner;

public class Details {

    public void UserDetail(){
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter your name ");
        String name=s.next();
        System.out.println(" Enter your roll no ");
        int rollNo=s.nextInt();
        System.out.println("Enter your field of interest ");
        String interest=s.next();
        System.out.println(" Hey, my name is "+name);
        System.out.println(" My roll number is "+rollNo);
        System.out.println(" My field of interest are "+interest);
    }

}

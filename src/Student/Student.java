package Student;

public class Student {
    String name;

    Student(String name){

        this.name=name;
    }
    public void display(){
        if (name== null || name.isBlank()){
            System.out.println("Name of the student is Unknown");
        }else{
            System.out.println("Name of the student is: "+name);
        }
    }

    }


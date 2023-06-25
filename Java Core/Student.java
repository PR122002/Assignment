import java.util.*;
import java.io.*;

class SSC_Student{

    public String name;
    public double percentage;

    SSC_Student(){
        name="XYZ";
        percentage=75;
    }

    SSC_Student(String name,double percentage){
        this.name=name;
        this.percentage=percentage;
    }

    public void display(){

        System.out.println("Name:"+name+"\n"+"Percentage:"+percentage);
    }
}

class Science_Student extends SSC_Student{

    public int physics,chemistry,mathematics;
    Science_Student(){
        super();
        physics=70;
        chemistry=70;
        mathematics=70;
    }

    Science_Student(String name,double percentage){
        super(name,percentage);
        physics=70;
        chemistry=70;
        mathematics=70;
    }

    Science_Student(String name,double percentage,int physics,int chemistry,int mathematics){

        super(name,percentage);
        this.physics=physics;
        this.chemistry=chemistry;
        this.mathematics=mathematics;

    }

    public void display(){

        super.display();
        System.out.println("Physics Marks:"+physics);
        System.out.println("Chemistry Marks:"+chemistry);
        System.out.println("Math Marks:"+mathematics);
        System.out.println("\n");

    }
}

public class Student{
    public static void main(String[] args) {
        
        SSC_Student student1=new SSC_Student();
        SSC_Student student2=new SSC_Student("Ravi", 75);

        Science_Student student3=new Science_Student();
        Science_Student student4=new Science_Student("Ramesh", 80);
        Science_Student student5=new Science_Student("Suraj", 85, 72, 81, 90);


        System.out.println("SSC Students:\n");
        student1.display();
        System.out.println("\n");
        student2.display();

        System.out.println("\n");

        System.out.println("Science Students:\n");
        student3.display();
        student4.display();
        student5.display();
        
        
    }
}
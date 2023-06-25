import java.util.*;
import java.io.*;
class Student{

    private double marks;

    public void setMarks(double m){
        marks=m;
    }

    public double getMarks(){
        return marks;
    }
}

class School{

    public static void main(String[] args) {
        Student ramesh=new Student();
        Student ravi=new Student();
        Student suraj=new Student();

        ravi.setMarks(85);
        ramesh.setMarks(90);
        suraj.setMarks(98);

        System.out.println("Ravi's marks:"+ravi.getMarks());
        System.out.println("Ramesh's marks:"+ramesh.getMarks());
        System.out.println("Suraj's marks:"+suraj.getMarks());
    }
}
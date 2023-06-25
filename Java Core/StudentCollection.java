import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{

    int rollNo;
    int age;
    String name;

    Student(int rollNo,int age,String name){
        this.rollNo=rollNo;
        this.age=age;
        this.name=name;
    }

    public int hashCode(){
        return rollNo;
    }

    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        if(age>st.age)
            return 1;
        else
            return -1;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return s.rollNo == rollNo;
    }

    public String toString(){
        return rollNo+" "+name+" "+age;
    }


}

class NameComparator implements Comparator<Student>{  

    public int compare(Student s1,Student s2){  
        return s1.name.compareTo(s2.name);  
    }  
}  

class StudentCollection{
    public static void main(String[] args) {
        Student s1=new Student(1,16,"Ravi");
        Student s2=new Student(5, 19, "Aman");
        Student s3=new Student(10,18,"Suraj");
        Student s4=new Student(10, 15, "Karan");

        System.out.println("List");
        ArrayList<Student>listStudent=new ArrayList<>();
        listStudent.addAll(Arrays.asList(s1,s2,s3,s4));
        System.out.println(listStudent);

        System.out.println("\nSorted List using Comparable based on age");
        Collections.sort(listStudent);
        System.out.println(listStudent);

        System.out.println("\nSorted List using Comparator based on name");
        Collections.sort(listStudent,new NameComparator());
        System.out.println(listStudent);
        
        
        System.out.println("\nSet");
        HashSet<Student>setOfStudents=new HashSet<>();
        setOfStudents.addAll(Arrays.asList(s1,s2,s3,s4));
        System.out.println(setOfStudents);

        
        System.out.println("\nMap\n");
        Map<Integer,Student> studentsMap=new HashMap<>();
        studentsMap.put(s1.rollNo, s1);
        studentsMap.put(s2.rollNo, s2);
        studentsMap.put(s3.rollNo, s3);
        studentsMap.put(s4.rollNo, s4);

        for(Map.Entry<Integer,Student>entry:studentsMap.entrySet()){

            int key=entry.getKey();
            Student s=entry.getValue();

            System.out.println("Roll no "+ key+" Details:");
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }


        
    }
}






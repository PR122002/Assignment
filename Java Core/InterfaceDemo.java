import java.util.*;
import java.io.*;

interface Calculation{
    final double PI=3.14159;
    double getArea();
}

class Circle implements Calculation{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }
}

class Ellipse implements Calculation{
    double rx,ry;
    Ellipse(double rx,double ry){
        this.rx=rx;
        this.ry=ry;
    }

    public double getArea(){
        return PI*rx*ry;
    }
}

class Rectangle implements Calculation{

    double length,breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea(){
        return length*breadth;
    }
}

class InterfaceDemo{

    public static void main(String[] args) {
        Calculation ref=null;

        ref=new Circle(5);
        System.out.println("Area of Circle:"+ref.getArea());

        ref=new Ellipse(4, 4.5);
        System.out.println("Area of Ellipse:"+ref.getArea());

        ref=new Rectangle(4, 5);
        System.out.println("Area of Rectangle:"+ref.getArea());
    }
}
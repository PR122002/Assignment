import java.util.*;
import java.io.*;

abstract class Shape{
    double length,breadth;

    Shape(double l,double b){
        length=l;
        breadth=b;
    }

    abstract double getArea();
}

class Rectangle extends Shape{

    Rectangle(double l,double b){
        super(l,b);
    }

    double getArea(){
        return length*breadth;
    }
}

class Triangle extends Shape{
    Triangle(double l,double b){
        super(l,b);
    }

    double getArea(){
        return 0.5*length*breadth;
    }
}
class AbstractDemo{

    public static void main(String[] args) throws IOException {
        Shape reference;

        Rectangle r=new Rectangle(10, 5);
        Triangle t=new Triangle(7, 8);

        reference=r;
        System.out.println("Area of Rectangle:"+reference.getArea());

        reference=t;
        System.out.println("Area of Triangle:"+reference.getArea());
    }
}
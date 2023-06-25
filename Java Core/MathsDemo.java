package p2;
import p1.*;

public class MathsDemo{
    public static void main(String[] args) {
        Maths m=new Maths();
        double number=234572;

        if(m.isPrime(number)){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }

        if(m.isEven(number)){
            System.out.println(number+" is a even number");
        }
        else{
            System.out.println(number+" is not a even number");
        }

        System.out.println("Sum of digits in a number "+m.getSumOfDigits(number));
    }
}
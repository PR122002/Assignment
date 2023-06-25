import java.util.*;
import java.io.*;

class Factorial{

    public static long getFactorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number;
        try{
            number=Integer.parseInt(args[0]);

            if(number>=0){
                System.out.println("Factorial of "+number+" is "+getFactorial(number));
            }
            else{
                System.out.println("Factorial of negative number is not possible");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Number not specified");
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number");
        }
        finally{
            System.out.println("Program exceution completed");
        }
    }
}
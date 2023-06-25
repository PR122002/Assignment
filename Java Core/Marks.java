import java.util.*;
import java.io.*;


class Marks{

    public static void main(String[] args) {
        
        int marks[]={86,85,90,98,99,76,78,99};
        int highest_marks=getMaximum(marks);
        int lowest_marks=getMinimum(marks);
        System.out.println("Highest Marks:"+highest_marks);
        System.out.println("Lowest Marks:"+lowest_marks);
    }

    public static int getMaximum(int[] numbers){

        int highestNumber=numbers[0];
        for(int num:numbers){
            if(highestNumber<num){
                highestNumber=num;
            }
        }
        return highestNumber;
    }

    public static int getMinimum(int[] numbers){

        int lowestNumber=numbers[0];
        int i=0;

        while(i<numbers.length){
            if(numbers[i]<lowestNumber){
                lowestNumber=numbers[i];
            }
            i++;
        }
        return lowestNumber;

    }

}
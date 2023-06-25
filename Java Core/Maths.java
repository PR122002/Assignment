package p1;

public class Maths{

    public boolean isPrime(double number){
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isEven(double number){

        return number%2==0;
    }

    public double getSumOfDigits(double number){
        int sum = 0;
        while(number!=0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
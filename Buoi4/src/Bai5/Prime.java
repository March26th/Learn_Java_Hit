package Bai5;

public class Prime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
            return n>1;
    }
    public static boolean isPrime(long n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return n>1;
    }
    public static boolean isPrime(float n){
        return false;
    }
    public static boolean isPrime(double n){
        return false;
    }
}

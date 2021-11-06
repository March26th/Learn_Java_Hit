package Bai5;

public class RunMain {
    public static void main(String[] args) {
        Prime a=new Prime();
        System.out.println(a.isPrime(5));
        System.out.println(a.isPrime(7l));
        System.out.println(a.isPrime(5.5f));
        System.out.println(a.isPrime(-10.88));
    }
}

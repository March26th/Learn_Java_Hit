package Bai1;

import java.util.Scanner;
public class RunMain {
    public int Max_number(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        RunMain run=new RunMain();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=run.Max_number(a,b,c);
        System.out.println("max = "+max);
    }

}

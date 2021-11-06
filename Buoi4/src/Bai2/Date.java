package Bai2;

import java.util.Scanner;

public class Date {
    private int d,m,y;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ngày : ");
        d=sc.nextInt();
        System.out.println("Nhập tháng : ");
        m=sc.nextInt();
        System.out.println("Nhập năm : ");
        y=sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Ngày Sinh : "+ d + " / " + m + " / "+ y);
    }
}

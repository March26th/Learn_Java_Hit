package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n : ");
        n= sc.nextInt();
        Sach[] s;
        s = new Sach[n];
        for(int i=0;i<n;i++){
            s[i]=new Sach();
            System.out.println("Nhập thông tin sách thứ "+(i+1));
            s[i].Nhap();
        }
        for(int i=0;i<n;i++){
            System.out.println("Thông tin sách thứ "+(i+1));
            s[i].Xuat();
        }
    }
}

package Bai3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private int n;
    Hang[] a;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã phiếu : ");
        maPhieu=sc.nextLine();
        System.out.println("Nhập n : ");
        n=sc.nextInt();
        a=new Hang[n];
        for(int i=0;i<n;i++){
            a[i]=new Hang();
            System.out.println("Nhập thông tin hàng thứ "+(i+1));
            a[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Mã phiếu : "+maPhieu);
        for(int i=0;i<n;i++){
            System.out.println("Thông tin hàng thứ "+ (i+1));
            a[i].Xuat();
        }
    }
}

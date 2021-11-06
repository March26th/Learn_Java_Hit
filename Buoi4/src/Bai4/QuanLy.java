package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQuanLy,hoTen;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã quản lý : ");
        maQuanLy=sc.nextLine();
        System.out.println("Nhập họ tên : ");
        hoTen=sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Mã quản lý : "+maQuanLy);
        System.out.println("Họ tên : "+hoTen);
    }
}

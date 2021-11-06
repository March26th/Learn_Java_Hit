package Bai2;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu,hoTen;
    Date ns=new Date();
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã nhân sự : ");
        maNhanSu=sc.nextLine();
        System.out.println("Nhập họ tên : ");
        hoTen=sc.nextLine();
        ns.Nhap();
    }
    public void Xuat(){
        System.out.println("Mã nhân sự : "+maNhanSu);
        System.out.println("Họ tên : "+hoTen);
        ns.Xuat();
    }
}

package Bai3;

import java.util.Scanner;

public class Nguoi {
    private String hoTen,ngaySinh,queQuan;
    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập họ tên : ");
        hoTen=scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        ngaySinh=scanner.nextLine();
        System.out.println("Nhập quê quán : ");
        queQuan=scanner.nextLine();
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void xuat(){
        System.out.println("Họ tên : "+hoTen);
        System.out.println("Ngày sinh : "+ngaySinh);
        System.out.println("Quê quán : "+queQuan);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}

package Bai1;

import java.util.Scanner;

public class SanPham {
    private String maSP,tenSP,tenHang,ngayNhap;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String tenHang, String ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHang = tenHang;
        this.ngayNhap = ngayNhap;
    }


    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm : ");
        maSP=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm : ");
        tenSP=scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        tenHang=scanner.nextLine();
        System.out.println("Nhập ngày nhập : ");
        ngayNhap=scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Mã sản phẩm : "+maSP);
        System.out.println("Tên sản phẩm : "+tenSP);
        System.out.println("Tên hãng sản xuất : "+tenHang);
        System.out.println("Ngày nhập : "+ngayNhap);
    }
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

}

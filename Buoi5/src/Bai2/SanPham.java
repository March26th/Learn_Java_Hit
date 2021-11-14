package Bai2;

import java.util.Scanner;

public class SanPham {
    private String maSP,tenSP;
    private int soLuong;
    private float donGia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm : ");
        maSP=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm : ");
        tenSP=scanner.nextLine();
        System.out.println("Nhập số lượng : ");
        soLuong=scanner.nextInt();
        System.out.println("Nhập đơn giá : ");
        donGia=scanner.nextFloat();
    }
    public float thanhtien(){
        return donGia*soLuong;
    }
    public void xuat(){
        System.out.format("%20s%20s%10d%10f%15f",maSP,tenSP,soLuong,donGia,thanhtien());
        System.out.println();
    }

}

package Bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV,nganh;
    private int khoaHoc;

    public SinhVien() {
    }
    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }
    public void Setter() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.println("Nhap nganh hoc: ");
        nganh = scanner.nextLine();
        System.out.println("Nhap khoa hoc: ");
        khoaHoc = scanner.nextInt();
        scanner.nextLine();
    }

    public void Getter(){
        System.out.format("%20s%20s%15s%10s%10s%10d", maSV, getHoTen(), getQueQuan(), getNgaySinh(), nganh, khoaHoc);
        System.out.println();
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}

package Bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nXB;
    private int soTrang;
    private float giaTien;

    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã sách : ");
        maSach=sc.nextLine();
        System.out.println("Nhập tên sách : ");
        tenSach=sc.nextLine();
        System.out.println("Nhập nhà xuất bản : ");
        nXB=sc.nextLine();
        System.out.println("Nhập số trang : ");
        soTrang= sc.nextInt();
        System.out.println("Nhập giá tiền : ");
        giaTien=sc.nextFloat();
    }
    public void Xuat(){
        System.out.println("Mã sách : "+maSach);
        System.out.println("Tên sách : "+tenSach);
        System.out.println("Nhà xuất bản : "+nXB);
        System.out.println("Số trang : "+soTrang);
        System.out.println("Giá tiền : "+giaTien);

    }

}

package Bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong,tenPhong;
    private float dienTich;
    QuanLy x=new QuanLy();
    May[] y;
    private int n;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã phòng : ");
        maPhong=sc.nextLine();
        System.out.println("Nhập tên phòng : ");
        tenPhong=sc.nextLine();
        System.out.println("Nhập diện tích : ");
        dienTich=sc.nextFloat();
        x.Nhap();
        System.out.println("Nhập số lượng máy n : ");
        n=sc.nextInt();
        y=new May[n];
        for(int i=0;i<n;i++){
            y[i]=new May();
            System.out.println("Nhập thông tin máy thứ "+(i+1));
            y[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Mã phòng : "+maPhong);
        System.out.println("Tên phòng : "+tenPhong);
        System.out.println("Diện tích : "+dienTich);
        x.Xuat();
        for (int i=0;i<n;i++){
            System.out.println("Thông tin máy thứ "+(i+1));
            y[i].Xuat();
        }
    }
}

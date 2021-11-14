package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private String maLH,tenLH,ngayMo,giaoVien;
    ArrayList<SinhVien> sinhViens;
    int n;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, ArrayList<SinhVien> sinhViens, int n) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.sinhViens = sinhViens;
        this.n = n;
    }

    public void Setter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã lớp học : ");
        maLH=scanner.nextLine();
        System.out.println("Nhập tên lớp học : ");
        tenLH=scanner.nextLine();
        System.out.println("Nhập ngày mở : ");
        ngayMo=scanner.nextLine();
        System.out.println("Nhập giáo viên : ");
        giaoVien=scanner.nextLine();
        System.out.println("Nhập n : ");
        n=scanner.nextInt();
        sinhViens=new ArrayList<>();
        for(int i=0;i<n;i++){
            SinhVien s=new SinhVien();
            s.Setter();
            sinhViens.add(s);
        }
    }
    public void Getter(){
        System.out.println("Mã lớp học : "+maLH);
        System.out.println("Tên lớp học : "+tenLH);
        System.out.println("Ngày mở : "+ngayMo);
        System.out.println("Giáo viên : "+giaoVien);
        System.out.format("%20s%20s%15s%10s%10s%10s","Mã sinh viên","Họ tên","Ngày sinh","Quê quán","Ngành","Khóa học");
        System.out.println();
        for(SinhVien o:sinhViens){
            o.Getter();
            System.out.println();
        }
    }
}

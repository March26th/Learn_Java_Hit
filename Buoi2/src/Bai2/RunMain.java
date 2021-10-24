package Bai2;
import java.util.Scanner;

import static java.lang.System.*;

public class RunMain {
    public static Scanner sc=new Scanner(System.in);
    public static void NhapMang(int []a,int n) {
        out.println("Nhập Mảng : ");
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
    }
     public static void XuatMang(int []a,int n){
         out.println("Mảng : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static int[] Insert(int a[], int n ){
        out.println("Nhập vị trí thêm : ");
        int pos=sc.nextInt();
        out.println("Nhâp giá trị cần thêm : ");
        int value=sc.nextInt();

        int []newA = new int[a.length + 1];

        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newA[i] = a[i];
            else if (i == pos - 1)
                newA[i] = value;
            else
                newA[i] = a[i - 1];
        }

        return newA;
    }
    public static int[] Remove(int[] a, int n )
    {
        System.out.println("Nhập vị trí cần xóa : ");
        int pos=sc.nextInt();
        int[] newA = new int[a.length-1];
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (i == pos-1) {
                continue;
            }
            newA[t++] = a[i];
        }
        return newA;
    }
    public static void Reverse(int []a,int n){
        for(int i=n-1;i>=0;i--){
            out.print(a[i] +" ");
        }
    }
    public  static void display(int []a,int n){
        int t=a[1];
        out.println("Phần tử a[1] : "+t);
        out.print("Các phần tử chia hết cho a[1] : ");
        for(int i=0;i<n;i++){
            if(a[i]%t==0){
                out.print(a[i]+" ");
            }
        }
    }
    public static boolean CheckSNT(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
            return n>1;
    }
    public static int SumOfSNT(int []a,int n){
        int s=0;
        for(int i=0;i<n;i++){
            if(CheckSNT(a[i])){
                s+=a[i];
            }
        }
        return s;
    }
    public static int Close(){
        return 0;
    }
    public static void main(String[] args) {
        out.println("Nhập n : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int input;
        do{
            out.println("Nhập chức năng : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    NhapMang(a, n);
                    break;
                case 2:
                    XuatMang(a, a.length);
                    break;
                case 3:
                    a = Insert(a, n);
                    XuatMang(a, a.length);
                    break;
                case 4:
                    a = Remove(a,n);
                    XuatMang(a, a.length);
                    break;
                case 5:
                    Reverse(a, a.length);
                    break;
                case 6:
                    display(a, n);
                    break;
                case 7:
                    out.println("Sum of SNT " + SumOfSNT(a, a.length));
                    break;
                case 8:
                    return;
            }
        }while (input != 8);
    }
}

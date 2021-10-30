package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 =new Array();
        Array arr2 =new Array();
        System.out.println("Nhập mảng 1 ");
        arr1.inputData();
        System.out.println("Nhập mảng 2 ");
        arr2.inputData();
        double tbc1=(double)arr1.Sum()/arr1.getMyArray().length;
        double tbc2=(double)arr2.Sum()/arr2.getMyArray().length;
        if(tbc1>tbc2){
            System.out.println("TBC mảng arr1 lớn hơn TBC mảng arr2");
            System.out.println("Mảng arr1 : ");
            arr1.Show();
        }
        else if(tbc1<tbc2){
            System.out.println("TBC mảng arr1 bé hơn TBC mảng arr2");
            System.out.print("Mảng arr2 : ");
            arr2.Show();
        }
        else {
            System.out.println("Bye");
        }
    }
}

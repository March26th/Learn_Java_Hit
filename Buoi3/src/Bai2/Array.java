package Bai2;

import java.util.Scanner;

public class Array {
    private static Scanner sc = new Scanner(System.in);
    private int[] myArray;
    private int n;

    public Array() {
        this.myArray = null;
        this.n = 0;
    }

    public Array(int[] myArray, int n) {
        setN(n);
        for (int i = 0; i < myArray.length; i++) {
            setMyArray(myArray);
        }
    }

    public void inputData() {
        System.out.println("Nhập số phần tử của mảng : ");
        n = sc.nextInt();
        myArray=new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
    }

    public void Show() {
        for (int i = 0; i < n; i++)
            System.out.print(myArray[i] + " ");
        System.out.println();
    }

    public int Sum() {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += myArray[i];
        return sum;
    }
    public void Filter(boolean flag){
        if(flag){
            System.out.println("Mảng số chẵn : ");
            for(int i:myArray){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.println("Mảng số lẻ : ");
            for (int i:myArray){
                    if(i%2==1){
                        System.out.println(i+" ");
                    }
            }
        }
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

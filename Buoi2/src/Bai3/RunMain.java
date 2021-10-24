package Bai3;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        int dem=0;
        for(int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                int a = Integer.parseInt(String.valueOf(temp));
                sum+=a;
                dem++;
            }
        }
        if(dem>0){
            System.out.println(true);
            System.out.println("Trung Bình Cộng = "+(float) sum/dem);
        }
        else{
            System.out.println(false);
            System.out.println("Không có ký tự số trong chuỗi!");
        }

    }
}

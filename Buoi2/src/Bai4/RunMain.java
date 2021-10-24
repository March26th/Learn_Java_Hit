package Bai4;
import java.util.Locale;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(char c='0';c<= '9' ;c++){
            s=s.replace(c+"","");
        }
        s=s.replaceAll("\\s\\s+"," ").trim();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            s=s.replace(words[i].charAt(0),Character.toUpperCase(words[i].charAt(0)));
        }
        System.out.println(s);
    }


}

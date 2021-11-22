package Bai2;

    import java.util.ArrayList;
    import java.util.Scanner;
public class RunMain {
    private static ArrayList<Book> books = new ArrayList<>();
    private static int n;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Nhap();
        Xuat();
    }

        private static void Nhap() {
            System.out.print("Nhập số lượng sách: ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sách thứ " + (i + 1));
                Book book = new Book();
                book.Nhap();
                books.add(book);
            }
        }
        private static void Xuat() {
            System.out.format("%-20s %-20s %-20s %-20s %-15s %-15s\n", "Number Of Page", "AuThor", "ID", "Name", "publisher", "price");
            for (Book book : books) {
                book.Xuat();
                }
            }

    }



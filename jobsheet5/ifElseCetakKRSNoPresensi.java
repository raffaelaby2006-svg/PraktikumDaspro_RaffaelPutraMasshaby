import java.util.Scanner;

public class ifElseCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- pilih semester ---");
        System.out.println("KRS Semester 1 ditampilkan");
        System.out.println("KRS Semester 2 ditampilkan");
        System.out.println("KRS Semester 3 ditampilkan");
        System.out.print("semester tidak valid");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (menu == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (menu == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else {
            System.out.println("semester tidak valid");
        }
    }
}

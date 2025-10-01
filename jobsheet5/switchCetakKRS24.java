import java.util.Scanner;

public class switchCetakKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println(" x:--- Cetak KRS SIAKAD ---");
        System.out.print(" x:Masukkan semester saat ini: ");
        int Semester = sc.nextInt();

        switch (Semester) {
            case 1 -> System.out.println("KRS Semester 1 ditampilkan");
            case 2 -> System.out.println("KRS Semester 2 ditampilkan");
            case 3 -> System.out.println("KRS Semester 3 ditampilkan");
            case 4 -> System.out.println("KRS Semester 4 ditampilkan");
            case 5 -> System.out.println("KRS Semester 5 ditampilkan");
            case 6 -> System.out.println("KRS Semester 6 ditampilkan");
            case 7 -> System.out.println("KRS Semester 7 ditampilkan");
            case 8 -> System.out.println("KRS Semester 8 ditampilkan");
            default -> System.out.println("Semester tidak valid");
        }
    }
}
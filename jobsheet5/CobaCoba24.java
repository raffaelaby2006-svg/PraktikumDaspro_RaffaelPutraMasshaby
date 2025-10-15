import java.util.Scanner;

public class CobaCoba24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String minuman, pilihan;
        int count = 0;

        do {
            System.out.print("Masukkan nama minuman: ");
            minuman = input.nextLine();
            System.out.println(minuman + " dipesan");
            count++;

            System.out.print("Apakah ada minuman lain yang dipesan? (ya/tidak): ");
            pilihan = input.nextLine();

        } while (pilihan.equalsIgnoreCase("ya"));

        System.out.print("Total variasi minuman yang dibeli: " + count);
        input.close();
    }
}

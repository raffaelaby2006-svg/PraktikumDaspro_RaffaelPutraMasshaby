import java.util.Scanner;

public class tugas24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemPerCabang = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemPerCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemPerCabang + " item");

            totalSeluruhPelanggan += jumlahPelanggan;
            totalSeluruhItem += totalItemPerCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem + " item");

        sc.close();
    }
}
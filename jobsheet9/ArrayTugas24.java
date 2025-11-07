import java.util.Scanner;
public class ArrayTugas24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String[] menu = {
            "Nasi Goreng", "Capucino", "Roti Bakar", "Kentang Goreng",
            "Teh Tarik", "Mie Goreng", "Chocolate Ice"
        };
        System.out.println("=== Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                System.out.println(" Makanan \"" + menu[i] + "\" tersedia di menu.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println(" Maaf, makanan \"" + cari + "\" tidak tersedia di menu.");
        }
    }
}

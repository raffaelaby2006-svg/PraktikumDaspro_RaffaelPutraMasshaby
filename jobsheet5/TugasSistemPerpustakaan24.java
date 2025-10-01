import java.util.Scanner;

public class TugasSistemPerpustakaan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Boleh masuk perpustakaan.");
        } else {
            System.out.println("Ditolak masuk perpustakaan.");
        }
    }
}


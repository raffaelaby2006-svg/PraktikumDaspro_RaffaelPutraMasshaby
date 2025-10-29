import java.util.Scanner;

public class coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tinggiLakiLaki;
        int tinggiPerempuan;

        String keteranganLakiLaki;
        String keteranganPerempuan;

        System.out.println("\n PROGRAM PENERIMAAN TARUNA");
        System.out.print("Masukkan TINGGI BADAN LAKI-LAKI (cm): ");
        tinggiLakiLaki = sc.nextInt(); 
        
        System.out.print("Masukkan TINGGI BADAN PEREMPUAN (cm): ");
        tinggiPerempuan = sc.nextInt();
        
        if (tinggiLakiLaki >= 165) {
            keteranganLakiLaki = "LULUS";
        } else { 
            keteranganLakiLaki = "TIDAK LULUS";
        }

        if (tinggiPerempuan > 160) {
            keteranganPerempuan = "LULUS";
        } else { 
            keteranganPerempuan = "TIDAK LULUS";
        }

        System.out.println("\n===== HASIL SELEKSI TARUNA =====");
        System.out.println("Tinggi Badan Laki-Laki: " + tinggiLakiLaki + " cm");
        System.out.println("Keterangan Laki-Laki: " + keteranganLakiLaki);
        System.out.println("Tinggi Badan Perempuan: " + tinggiPerempuan + " cm");
        System.out.println("Keterangan Perempuan: " + keteranganPerempuan);
    
        sc.close();
    }
}
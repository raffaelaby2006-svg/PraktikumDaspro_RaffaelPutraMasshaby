import java.util.Scanner;

public class CaseMethod24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        double uts1, uas1, tugas1;
        double uts2, uas2, tugas2;

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("NIM  : ");
        nim = sc.nextLine();

        System.out.println("\n-- Mata Kuliah 1: Algoritma dan Pemrograman --");
        System.out.print("Nilai UTS   : ");
        uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas1 = sc.nextDouble();

        System.out.println("\n-- Mata Kuliah 2: Struktur Data --");
        System.out.print("Nilai UTS   : ");
        uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas2 = sc.nextDouble();

        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        double rataRata = (akhir1 + akhir2) / 2;

        System.out.println("\n============ Hasil Penlaian Akademik ============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------");

        tampilkanHasil("Algoritma Pemrograman", uts1, uas1, tugas1, akhir1);
        tampilkanHasil("Struktur Data", uts2, uas2, tugas2, akhir2);

        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rataRata);
        if (rataRata >= 70) {
            System.out.println("Status Semester : LULUS");
        } else {
            System.out.println("Status Semester : TIDAK LULUS (Rata-rata < 70)");
        }
        sc.close();
    }

    public static void tampilkanHasil(String matkul, double uts, double uas, double tugas, double akhir) {
        String huruf, status;

        if (akhir >= 85) huruf = "A";
        else if (akhir >= 80) huruf = "A-";
        else if (akhir >= 75) huruf = "B+";
        else if (akhir >= 70) huruf = "B";
        else if (akhir >= 65) huruf = "C+";
        else if (akhir >= 60) huruf = "C";
        else if (akhir >= 50) huruf = "D";
        else huruf = "E";
        if (akhir >= 60) status = "LULUS";
        else status = "TIDAK LULUS";
        System.out.printf("%-20s\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", matkul, uts, uas, tugas, akhir, huruf, status);
    }
}

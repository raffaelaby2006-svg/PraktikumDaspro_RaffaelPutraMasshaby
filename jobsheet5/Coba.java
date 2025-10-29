import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        double tugas1, uts1, uas1;
        double tugas2, uts2, uas2;

        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();

        System.out.println("\nMata Kuliah 1 : Algoritma dan Pemrograman");
        System.out.print("Nilai Tugas\t: ");
        tugas1 = sc.nextDouble();
        System.out.print("Nilai UTS\t: ");
        uts1 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        uas1 = sc.nextDouble();

        System.out.println("\nMata Kuliah 2 : Struktur Data");
        System.out.print("Nilai Tugas\t: ");
        tugas2 = sc.nextDouble();
        System.out.print("Nilai UTS\t: ");
        uts2 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        uas2 = sc.nextDouble();

        double nilai1 = (0.3 * tugas1) + (0.3 * uts1) + (0.4 * uas1);
        double nilai2 = (0.3 * tugas2) + (0.3 * uts2) + (0.4 * uas2);
        double nilaiAkhir = (nilai1 + nilai2) / 2;

        String predikat;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            predikat = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            predikat = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            predikat = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            predikat = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            predikat = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        String keterangan = (nilaiAkhir >= 60) ? "LULUS" : "TIDAK LULUS";

        System.out.println("\nHASIL PENILAIAN AKADEMIK");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTUGAS\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------");

        tampilkanHasil("Algoritma & Pemrograman", uts1, uas1, tugas1, nilai1);
        tampilkanHasil("Struktur Data", uts2, uas2, tugas2, nilai2);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", nilaiAkhir);
        System.out.println("Predikat : " + predikat);
        System.out.println("Status Semester : " + keterangan);

    
    }

    public static void tampilkanHasil(String matkul, double uts, double uas, double tugas, double nilai) {
        String huruf;
        if (nilai > 80 && nilai <= 100) huruf = "A";
        else if (nilai > 73 && nilai <= 80) huruf = "B+";
        else if (nilai > 65 && nilai <= 73) huruf = "B";
        else if (nilai > 60 && nilai <= 65) huruf = "C+";
        else if (nilai > 50 && nilai <= 60) huruf = "C";
        else if (nilai > 39 && nilai <= 50) huruf = "D";
        else huruf = "E";

        String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.printf("%-24s\t%.1f\t%.1f\t%.1f\t%.2f\t\t%s\t\t%s\n",
                matkul, uts, uas, tugas, nilai, huruf, status);
    }
}
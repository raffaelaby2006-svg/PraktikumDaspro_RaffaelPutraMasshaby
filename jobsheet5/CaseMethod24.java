import java.util.Scanner;
public class CaseMethod24 {
     
    public static double hitungNilaiAkhir(double uts, double uas, double tugas) {
        return (0.3 * uts) + (0.4 * uas) + (0.3 * tugas);
    }

    public static String[] konversiNilai(double nilai) {
        String[] hasil = new String[3];
        if (nilai >= 80 && nilai <= 100) {
            hasil[0] = "A"; hasil[1] = "4"; hasil[2] = "Sangat Baik";
        } else if (nilai >= 73) {
            hasil[0] = "B+"; hasil[1] = "3.5"; hasil[2] = "Lebih dari Baik";
        } else if (nilai >= 65) {
            hasil[0] = "B"; hasil[1] = "3"; hasil[2] = "Baik";
        } else if (nilai >= 60) {
            hasil[0] = "C+"; hasil[1] = "2.5"; hasil[2] = "Lebih dari Cukup";
        } else if (nilai >= 50) {
            hasil[0] = "C"; hasil[1] = "2"; hasil[2] = "Cukup";
        } else if (nilai >= 39) {
            hasil[0] = "D"; hasil[1] = "1"; hasil[2] = "Kurang";
        } else {
            hasil[0] = "E"; hasil[1] = "0"; hasil[2] = "Gagal";
        }
        return hasil;
    }

    public static String statusKelulusan(double nilaiAkhir) {
        return (nilaiAkhir >= 60) ? "LULUS" : "TIDAK LULUS";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM : ");
        String nim = input.nextLine();

        String[] mataKuliah = {"Algoritma dan Pemrograman", "Struktur Data"};
        double[] uts = new double[2];
        double[] uas = new double[2];
        double[] tugas = new double[2];
        double[] nilaiAkhir = new double[2];
        String[][] konversi = new String[2][3];
        String[] status = new String[2];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println("\nMata Kuliah: " + mataKuliah[i]);
            System.out.print("Nilai UTS: ");
            uts[i] = input.nextDouble();
            System.out.print("Nilai UAS: ");
            uas[i] = input.nextDouble();
            System.out.print("Nilai Tugas: ");
            tugas[i] = input.nextDouble();

            nilaiAkhir[i] = hitungNilaiAkhir(uts[i], uas[i], tugas[i]);
            konversi[i] = konversiNilai(nilaiAkhir[i]);
            status[i] = statusKelulusan(nilaiAkhir[i]);
        }

        System.out.println("\n================= HASIL PENILAIAN AKADEMIK =================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-----------------------------------------------------------------------");

        double total = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-20s\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n",
                    mataKuliah[i], uts[i], uas[i], tugas[i], nilaiAkhir[i], konversi[i][0], status[i]);
            total += nilaiAkhir[i];
        }

        double rataRata = total / mataKuliah.length;
        System.out.printf("%nRata-rata Nilai Akhir: %.2f%n", rataRata);
        if (rataRata >= 70) {
            System.out.println("Status Semester  : LULUS");
        } else {
            System.out.println("Status Semester  : TIDAK LULUS (Rata-rata < 70)");
        }

        System.out.println("\n=== Program Selesai ===");
        input.close();
    }
}

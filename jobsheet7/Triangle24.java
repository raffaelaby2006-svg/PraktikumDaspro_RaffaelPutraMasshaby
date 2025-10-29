import java.util.Scanner;

public class Triangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        for (int iOuter = 1; iOuter <= 5; iOuter++){
            for (int i = 1; i<=iOuter; i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
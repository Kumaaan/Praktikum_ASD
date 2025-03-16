package BruteForceDivideQonquer.Minggu5;
import java.util.Scanner;
public class MainPangkat01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Pangkat01[] png = new Pangkat01[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat01(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTE FORCE:");
        for (Pangkat01 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE & CONQUER:");
        for (Pangkat01 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC());
        }
        sc.close();
    }
}
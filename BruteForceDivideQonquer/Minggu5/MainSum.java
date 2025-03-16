package BruteForceDivideQonquer.Minggu5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Sum01 sm = new Sum01(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan keuntungan ke-" + (i+1)+ ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Qonquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}

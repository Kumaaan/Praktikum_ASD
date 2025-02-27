package Praktikum_ASD.Jobsheet3.Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatakuliah = sc.nextInt();
        System.out.println(" ");

        sc.nextLine();
        Matakuliah1[] arrayOfMatakuliah = new Matakuliah1[jumlahMatakuliah];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah1("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData();
        }
        for ( int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}

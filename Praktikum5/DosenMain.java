package Praktikum5;
import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataDosen list = new DataDosen(10);

        for (int i = 0; i < list.listDosen.length ; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");

            Boolean jenisKelamin = false;
            if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } 
    
            Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
            list.tambah(dsn);
        }
        System.out.println("\nData dosen sebelum sorting: ");
        list.tampil();

        System.out.println("\nData dosen setelah sorting berdasarkan Usia (ASC): ");
        list.sortingASC();
        list.tampil();

        System.out.println("\nData dosen setelah sorting berdasarkan Usia (DSC):");
        list.sortingDSC();
        list.tampil();
        sc.close();
    }
}

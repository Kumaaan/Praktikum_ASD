package Jobsheet7;
import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen01 list = new DataDosen01(3);
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
    
            Dosen01 dsn = new Dosen01(kode, nama, jenisKelamin, usia);
            list.tambah(dsn);
        }
        System.out.println("\nData dosen sebelum sorting: ");
        list.tampil();

        System.out.println("\nData dosen setelah sorting berdasarkan Usia (ASC): ");
        list.sortingASC();
        list.tampil();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Percarian Data");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Masukkan usia dosen yang akan dicari: ");
        System.out.print("Usia: ");
        int cari = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan sequential search");
        System.out.println("----------------------------------------");
        int posisi = list.pencarianDataSequential01(cari);
        list.tampilDataSearch(cari, posisi);
        System.out.println(" ");

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Percarian Data");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Masukkan usia dosen yang akan dicari: ");
        System.out.print("Usia: ");
        cari = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------------------------");
        posisi = list.pencarianDataBinary01(cari, 0, list.listDosen.length - 1);
        list.tampilDataSearch(cari, posisi);
        sc.close();
    }
}

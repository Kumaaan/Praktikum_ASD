package Jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            System.out.println("----------------------------");
            sc.nextLine();

            Mahasiswa01 m = new Mahasiswa01(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        // System.out.println("-------------------------------------------------------------------");
        // System.out.println("Percarian Data");
        // System.out.println("-------------------------------------------------------------------");
        // System.out.println("Masukkan IPK mahasiswa yang akan dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("Menggunakan sequantial searching");
        // double posisi = list.sequentialSearch(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Percarian Data");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang akan dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMahasiswa-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        sc.close();
    }
}

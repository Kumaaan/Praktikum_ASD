package Praktikum5;
import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
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

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
        sc.close();
    }
}

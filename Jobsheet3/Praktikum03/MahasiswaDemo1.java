package Jobsheet3.Praktikum03;
import java.util.Scanner;
public class MahasiswaDemo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa1[] arrayOfMahasiswa = new Mahasiswa1[3];
        String a;   

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa1();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            a = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(a);
            System.out.println("=========================");
        }
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
        sc.close();
    }
}

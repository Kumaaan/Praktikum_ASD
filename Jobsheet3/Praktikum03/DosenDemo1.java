package Praktikum_ASD.Jobsheet3.Praktikum03;
import java.util.Scanner;
public class DosenDemo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen1[] arrayOfDosen = new Dosen1[3];
        String kode;
        String nama;
        String jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.next();
            System.out.print("Nama          : ");
            nama = sc.next();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.next();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            System.out.println("=========================");
            arrayOfDosen[i] = new Dosen1(kode, nama, jenisKelamin, usia);
        }
       
        DataDosen dataDosen = new DataDosen();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rataRataUsiaPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}

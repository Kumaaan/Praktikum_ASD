package Praktikum_ASD.Jobsheet3.Praktikum03;
import java.util.Scanner;
public class DosenDemo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen1[] arrayOfDosen = new Dosen1[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen1();

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            arrayOfDosen[i].jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("=========================");
        }
        int nomor = 1;
        for (Dosen1 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + nomor++);
            dosen.dataSemuaDosen();
        }
        Dosen1 dosen = new Dosen1();
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dosen.rataRataUsiaPerJenisKelamin(arrayOfDosen);
        dosen.infoDosenPalingTua(arrayOfDosen);
        dosen.infoDosenPalingMuda(arrayOfDosen);
        sc.close();
    }
}

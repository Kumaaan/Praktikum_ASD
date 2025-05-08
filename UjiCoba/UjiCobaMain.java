package UjiCoba;

import java.util.Scanner;
public class UjiCobaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int jml = sc.nextInt();
        
        UjiCobaData[] mahasiswa = new UjiCobaData[4];
        mahasiswa[0] = new UjiCobaData("Adi", "2000", "TI 1E", "01");
        mahasiswa[1] = new UjiCobaData("Budi", "2001", "TI 1E", "02");
        mahasiswa[2] = new UjiCobaData("Yan", "2002", "TI 1E", "03");
        mahasiswa[3] = new UjiCobaData("Firman", "2003", "TI 1E", "04");

        int menu = 0;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
           
            switch (menu) {
                case 1:
                    System.out.println("Daftar mahasiswa: ");
                    System.out.println("Nama\t\tNIM\t\tKelas\t   Absen\n");
                    for (UjiCobaData n : mahasiswa) {
                        n.tampilData();
                    }
                    break;
                
                case 2:

                    break;

                case 0:

                    break;

                default:

                    break;
            }
            
        }while(menu != 0);




        sc.close();
    }
}

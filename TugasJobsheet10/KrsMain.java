package TugasJobsheet10;
import java.util.Scanner;
public class KrsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        KrsQueue antrian = new KrsQueue(10);
        int pilihan;
        do{
            System.out.println("\n=== Menu Antrian layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Dua Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Paling Akhir");
            System.out.println("7. Jumlah Mahasiswa Sudah Diproses");
            System.out.println("8. Cek status antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    DataMahasiswa mhs = new DataMahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2: 
                    DataMahasiswa dilayani[] = antrian.layaniMahasiswa();
                    System.out.println("Melayani mahasiswa: ");
                    System.out.println("No. NIM - NAMA - PRODI - KELAS");
                    if (dilayani != null) {
                        for (int i = 0; i < dilayani.length; i++) {
                        System.out.print((i + 1) + ". ");
                        dilayani[i].tampilkanData();
                        }
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah data antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("Jumlah data sudah diproses: " + antrian.SudahDiProses());
                    break;
                case 8:
                    System.out.print("Status antrian: ");
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else if (antrian.IsFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Terdapat antrian");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}

package CM2;
import java.util.Scanner;

public class SistemAntrianKlinik {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AntrianPasien list = new AntrianPasien();
        QueueTransaksi riwayat = new QueueTransaksi(5);
        int pilihan;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien Ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--Tambah Antrian--");
                    System.out.print("Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK         : " );
                    String nik = sc.nextLine();
                    System.out.print("Keluhan     : ");
                    String keluhan = sc.nextLine();
                    Pasien data = new Pasien(nama, nik, keluhan);
                    list.tambahPasien(data);      
                    break;

                case 2:
                    list.tampilkanSemua();
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("\n--Melayani Pasien--");
                        System.out.println("Antrian kosong, tidak bisa dihapus.");
                        break;
                    } else {
                        System.out.println("\n--Melayani Pasien--");
                        Pasien pasien = list.LayaniPasien();
                        System.out.println("Pasien " + pasien.nama + " dipanggil");

                        System.out.print("Masukkan ID Dokter    :" );
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter  :");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi  = sc.nextInt();
                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        TransaksiLayanan transaksi = new TransaksiLayanan (pasien, dokter, durasi);
                        riwayat.tambahAntrian(transaksi);
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                        break;
                    }

                case 4:
                    
                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 0:  
                    System.out.println("Keluar dari program.");
                    break;

                default:  
                    System.out.println("Pilihan tidak valid!");
                    
            }
        } while (pilihan != 0);
    }

    
}

package Jobsheet12;
import java.util.Scanner;
public class DLLMain01 {
    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
  public static void main(String[] args) {
    DoubleLinkedList01 list = new DoubleLinkedList01();
    Scanner scan = new Scanner (System.in);
    int pilihan;

    do {
        System.out.println("\n=== Menu Antrian layanan Akademik ===");
        System.out.println("1. Tambah di awal");
        System.out.println("2. Tambah di akhir");
        System.out.println("3. Hapus di awal");
        System.out.println("4. Hapus di akhir");
        System.out.println("5. Tampilkan data");
        System.out.println("6. Tambah setelah NIM");
        System.out.println("7. Cari berdasarkan NIM");
        System.out.println("8. Tambah sesuai posisi indeks.");
        System.out.println("9. Hapus setelah NIM.");
        System.out.println("10. Hapus sesuai posisi indeks");
        System.out.println("11. Tampil data pertama");
        System.out.println("12. Tampil data terakhir");
        System.out.println("13. Tampil data pada indeks tertentu");
        System.out.println("14. Tampilkan jumlah data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = scan.nextInt();
        scan.nextLine();

        switch (pilihan) {
            case 1 -> {
                Mahasiswa01 mhs = inputMahasiswa(scan);
                list.addFirst(mhs);
            }
            case 2 -> {
                Mahasiswa01 mhs = inputMahasiswa(scan);
                list.addLast(mhs);
            }
            case 3 -> list.removeFirst();
            case 4 -> list.removeLast();
            case 5 -> list.print();
            case 6 -> {
                System.out.print("Masukkan NIM: ");
                String keyNim = scan.nextLine();
                Mahasiswa01 mhs = inputMahasiswa(scan);
                list.insertAfter(keyNim, mhs);
            }
            case 7 -> {
                System.out.println("Masukkan NIM yang dicari: ");
                String nim = scan.nextLine();
                Node01 found = list.search(nim);
                if (found != null) {
                    System.out.println("Data ditemukan.");
                    found.data.tampil();    
                } else {
                    System.out.println("Data tidak ditemukan.");
                }
            }
            case 8 -> {
                System.out.print("Masukkan indeks: ");
                int idx = scan.nextInt(); scan.nextLine();
                Mahasiswa01 mhs = inputMahasiswa(scan);
                list.add(idx, mhs);
            }
            case 9 -> {
                System.out.print("Masukkan NIM: ");
                String nim = scan.nextLine();
                list.removeAfter(nim);
            }
            case 10 -> {
                System.out.print("Masukkan indeks: ");
                int idx = scan.nextInt(); scan.nextLine();
                list.remove(idx);
            }
            case 11 -> list.getFirst();
            case 12 -> list.getLast();
            case 13 -> {
                System.out.print("Masukkan indeks: ");
                int idx = scan.nextInt(); scan.nextLine();
                list.getIndex(idx);
            }
            case 14 -> System.out.println("Jumlah data: " + list.size());
            case 0 -> System.out.println("Keluar dari program.");
            default -> System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 0);
  }
}

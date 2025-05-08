package CaseMethod1;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] daftarMhs = new Mahasiswa[3];
        daftarMhs[0] = new Mahasiswa("2201", "Ali Rahman","Informatika"  );
        daftarMhs[1] = new Mahasiswa("2202", "Budi Santoso","Informatika"  );
        daftarMhs[2] = new Mahasiswa("2203", "Citra Dewi","Sistem Informasi Bisnis"  );

        MataKuliah[] daftarMtk = new MataKuliah[3];
        daftarMtk[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMtk[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMtk[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] daftarNilai = new Penilaian[5];
        daftarNilai[0] = new Penilaian(daftarMhs[0], daftarMtk[0], 80,   85, 90);
        daftarNilai[1] = new Penilaian(daftarMhs[0], daftarMtk[1], 60,   75, 70);
        daftarNilai[2] = new Penilaian(daftarMhs[1], daftarMtk[0], 75,   70, 80);
        daftarNilai[3] = new Penilaian(daftarMhs[2], daftarMtk[1], 85,   90, 95);
        daftarNilai[4] = new Penilaian(daftarMhs[2], daftarMtk[2], 80,   90, 65);
        
        int menu;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (Mahasiswa mhs : daftarMhs) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                
                case 2:
                    System.out.println("\nDaftar Mata Kuliah: ");
                    for (MataKuliah mtk : daftarMtk) {
                        mtk.tampilMatakuliah();
                    }
                    break;

                case 3:
                    System.out.println("\nData Penilaian: ");
                    for (Penilaian nilai : daftarNilai) {
                        nilai.tampilNilai();
                    }
                    break;

                case 4:
                    System.out.println("\nData Penilaian: ");
                    SortingMahasiswa urut = new SortingMahasiswa(daftarNilai);
                    urut.selectionSort();
                    urut.tampilSort();
                    break;

                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    SearchingMahasiswa search = new SearchingMahasiswa(daftarMhs, cari);
                    int indeks = search.sequentialSearch();
                    search.tampilDataSearch(cari, indeks);
                    break;

                case 6:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMK = sc.nextLine();
                    System.out.print("Masukkan Nilai Tugas Baru: ");
                    double tugasBaru = sc.nextDouble();
                    System.out.print("Masukkan Nilai UTS Baru: ");
                    double utsBaru = sc.nextDouble();
                    System.out.print("Masukkan Nilai UAS Baru: ");
                    double uasBaru = sc.nextDouble();
                    UpdateNilai update = new UpdateNilai(daftarNilai, nim, tugasBaru, utsBaru, uasBaru);
                    update.updateData();
                    
                case 0:
                    System.out.println("\nKeluar dari program! Terima kasih.");
                    break;

                default:
                    System.out.println("\nKode tidak valid!");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}

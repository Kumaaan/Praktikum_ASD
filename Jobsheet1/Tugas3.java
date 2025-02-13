import java.util.Scanner;
public class Tugas3 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static String[] mataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    
    static void inputData() {
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine();
        mataKuliah = new String[n];
        sks = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("SKS\t\t: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester\t: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah\t: ");
            hariKuliah[i] = sc.nextLine();
        }
        System.out.println("Data berhasil dimasukkan!");
    }
    static void tampilkanJadwal() {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        for (int i = 0; i < n; i++) {
            tampilkanDetail(i);
        }
    }
    static void tampilkanJadwalBerdasarkanHari() {
        System.out.print("Masukkan hari kuliah yang ingin dicari: ");
        String hari = sc.nextLine();
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                tampilkanDetail(i);
            }
        }
    }
    static void tampilkanJadwalBerdasarkanSemester() {
        System.out.print("Masukkan semester yang ingin dicari: ");
        int sem = sc.nextInt();
        sc.nextLine();
        System.out.println("\nJadwal Kuliah untuk Semester " + sem + ":");
        for (int i = 0; i < n; i++) {
            if (semester[i] == sem) {
                tampilkanDetail(i);
            }
        }
    }
    static void cariMataKuliah() {
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String nama = sc.nextLine();
        
        boolean cari = false;
        System.out.println("\nHasil Pencarian:");
        
        for (int i = 0; i < n; i++) {
            if (mataKuliah[i].equalsIgnoreCase(nama)) {
                tampilkanDetail(i);
                cari = true;
            }
        }
        
        if (!cari) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
    
    static void tampilkanDetail(int i) {
        System.out.println("\nNama: " + mataKuliah[i]);
        System.out.println("SKS: " + sks[i]);
        System.out.println("Semester: " + semester[i]);
        System.out.println("Hari: " + hariKuliah[i]);
    }
    public static void main(String[] args) {
        byte menu;
        do {
            System.out.println("\n==============================================");
            System.out.println("            Program Jadwal Kuliah");
            System.out.println("==============================================");
            System.out.println("1. Input Data Mata Kuliah");
            System.out.println("2. Tampilkan Seluruh Jadwal");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("5. Cari Mata Kuliah");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextByte();
            sc.nextLine();
            switch (menu) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanJadwal();
                    break;
                case 3:
                    tampilkanJadwalBerdasarkanHari();
                    break;
                case 4:
                    tampilkanJadwalBerdasarkanSemester();
                    break;
                case 5:
                    cariMataKuliah();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (menu!=6);
    }
}

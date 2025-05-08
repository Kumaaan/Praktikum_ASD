package Jobsheet9;

public class Mahasiswa01 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa01() {

    }
    Mahasiswa01(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai; 
    }

}

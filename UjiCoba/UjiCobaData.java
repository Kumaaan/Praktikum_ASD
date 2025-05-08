package UjiCoba;

public class UjiCobaData {
    String nama;
    String nim;
    String kelas;
    String absen;

    UjiCobaData(String nama, String nim,String kelas, String absen) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.absen = absen;
    }
    void tampilData() {
        System.out.printf("%-15s %-15s %-10s %-5s\n",nama, nim, kelas, absen);
    }
}
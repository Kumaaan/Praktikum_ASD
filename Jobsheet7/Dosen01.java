package Jobsheet7;
public class Dosen01 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen01 () {
    }
    Dosen01 (String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    String kelamin() {
        if (jenisKelamin == true) {
            return "Pria";
        } else {
            return "Wanita";
        }
    }
    void tampil() {
        kelamin();
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + kelamin());
        System.out.println("Usia            : " + usia);
    }
}

package Praktikum5;
public class Dosen {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen () {
    }
    Dosen (String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil() {
        String jkl = "";
        if (jenisKelamin == true) {
            jkl = "Pria";
        } else {
            jkl = "Wanita";
        }
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jkl);
        System.out.println("Usia            : " + usia);
    }
}

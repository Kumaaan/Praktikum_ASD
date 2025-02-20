public class MahasiswaMain1 {
    public static void main(String[] args) {
        Mahasiswa1 mhs1 = new Mahasiswa1();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa1 mhs2 = new Mahasiswa1 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);   
        mhs2.tampilkanInformasi();

        Mahasiswa1 mhsAdiLuhung = new Mahasiswa1 ("Adi Luhung", "244107020088", 5.0, "TI 1E");
        mhsAdiLuhung.tampilkanInformasi();
    }
}

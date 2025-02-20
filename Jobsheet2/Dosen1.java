public class Dosen1 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(int thnSkrg) {
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama: "+ nama);
        System.out.println("Status Aktif: "+ statusAktif);
        System.out.println("Masa Kerja: "+ hitungMasaKerja(thnSkrg));
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        if (status == true) {
            statusAktif = true;
        } else {
            statusAktif = false;
        }
    }
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
    public Dosen1 () {

    }
    public Dosen1 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}

package CM2;

public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;  
    int biaya;

    TransaksiLayanan (Pasien pasien, Dokter dokter, int durasi) {
        this.pasien = pasien;
        this.dokter = dokter;
        durasiLayanan = durasi;
        hitungBiaya();
    }
    int hitungBiaya() {
        return biaya = (durasiLayanan * 50000);
    }
}

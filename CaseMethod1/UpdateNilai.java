package CaseMethod1;

public class UpdateNilai {
    Penilaian[] daftarNilai;
    String nim;
    double tugasBaru, utsBaru, uasBaru;
    
    UpdateNilai(Penilaian[] daftarNilai, String nim, double tugasBaru, double utsBaru, double uasBaru) {
        this.daftarNilai = daftarNilai;
        this.nim = nim;
        this.tugasBaru = tugasBaru;
        this.utsBaru = utsBaru;
        this.uasBaru = uasBaru;
    }
    
    void updateData() {
        for (int i = 0; i < daftarNilai.length; i++) {
            if (daftarNilai[i].mahasiswa.NIM.equals(nim)) {
                daftarNilai[i].updateNilai(tugasBaru, utsBaru, uasBaru);
                System.out.println("Data nilai mahasiswa dengan NIM " +nim+ " berhasil diupdate.");
                return;
            }
        }
        System.out.println("Data mahasiswa dengan NIM " +nim+ " tidak ditemukan.");
    }

}

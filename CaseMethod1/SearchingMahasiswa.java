package CaseMethod1;    
public class SearchingMahasiswa {
    Mahasiswa[] data;
    String cari;
    SearchingMahasiswa(Mahasiswa[] data, String cari){
        this.data = data;
        this.cari = cari;
    }
    int sequentialSearch() {
        int posisi = -1;
        for (int j = 0; j < data.length; j++) {
            if (data[j].NIM.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilDataSearch(String nim, int indeks) {
        if (indeks != -1) {
            System.out.println("Mahasiswa ditemukan: NIM: " +data[indeks].NIM+ " | Nama: " +data[indeks].nama+ " | Prodi: " +data[indeks].prodi);
            
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +nim+ " tidak ditemukan");
        }
    }
}

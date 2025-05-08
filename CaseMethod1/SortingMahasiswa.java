package CaseMethod1;
public class SortingMahasiswa {
    Penilaian[] data;
    int jumData;
    SortingMahasiswa(Penilaian[] daftarNilai) {
        this.data = daftarNilai;
        this.jumData = daftarNilai.length;
    }
    void selectionSort (){
        for (int i = 0; i < jumData-1; i++) {       
            int max = i;
            for (int j = i+1; j < jumData; j++) {
                if (data [j].nilaiAkhir > data [max].nilaiAkhir){
                    max = j;
                }
            }
            double temp = data [i].nilaiAkhir;
            data [i].nilaiAkhir = data [max].nilaiAkhir;
            data [max].nilaiAkhir = temp;
        }
    }
    
    void tampilSort() {
        for (Penilaian n : data) {
            System.out.println(n.mahasiswa.nama+ " | " +n.mataKuliah.namaMK+ " | Nilai Akhir: " +n.nilaiAkhir);
        }
    }
}

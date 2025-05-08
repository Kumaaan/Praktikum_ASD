package Jobsheet7;
public class DataDosen01 {
    Dosen01[] listDosen;
    int idx;
    DataDosen01 (int n) {
        listDosen = new Dosen01 [n];
        idx = 0;
    }
    void tambah(Dosen01 dsn) {
        if (idx < listDosen.length) {
            listDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (Dosen01 dsn : listDosen) {
            if (dsn != null) {
                dsn.tampil();
                System.out.println("----------------------------");
            }
        }
    }
    void sortingASC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen01 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }
    int hasil = 0; 
    int pencarianDataSequential01(int cari) {
        hasil = 0;
        int posisiPertama = -1;
    
        for (int j = 0; j < listDosen.length; j++) {
            if (listDosen[j] != null && listDosen[j].usia == cari) {
                if (posisiPertama == -1) {
                    posisiPertama = j;
                }
                hasil++;
            }
        }
        return posisiPertama;
    }
    int pencarianDataBinary01(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            if (listDosen[mid].usia == cari) {
                hasil = 1;
    
                int i = mid - 1;
                while (i >= 0 && listDosen[i].usia == cari) {
                    hasil++;
                    i--;
                }
    
                int j = mid + 1;
                while (j < listDosen.length && listDosen[j].usia == cari) {
                    hasil++;
                    j++;
                }
    
                return mid;
            } else if (listDosen[mid].usia < cari) {
                return pencarianDataBinary01(cari, mid + 1, right);
            } else {
                return pencarianDataBinary01(cari, left, mid - 1);
            }
        }
        hasil = 0;
        return -1;
    }    
    void tampilDataSearch(int usia, int pos) {
        if (hasil > 1) {
            System.out.println("Peringatan! Ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        }
    
        if (hasil > 0) {
            System.out.println("Menampilkan semua dosen dengan usia " + usia + ":");
            for (int i = 0; i < listDosen.length; i++) {
                if (listDosen[i] != null && listDosen[i].usia == usia) {
                    System.out.println("----------------------------");
                    System.out.println("Kode\t\t : " + listDosen[i].kode);
                    System.out.println("Nama\t\t : " + listDosen[i].nama);
                    System.out.println("Jenis Kelamin : " + listDosen[i].kelamin());
                    System.out.println("Usia\t\t : " + listDosen[i].usia);
                }
            }
        } else {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
        }
    }
}

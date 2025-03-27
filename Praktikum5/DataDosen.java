package Praktikum5;
public class DataDosen {
    Dosen[] listDosen;
    int idx;
    DataDosen (int n) {
        listDosen = new Dosen [n];
        idx = 0;
    }
    void tambah(Dosen dsn) {
        if (idx < listDosen.length) {
            listDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (Dosen dsn : listDosen) {
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
                    Dosen tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }
    void sortingDSC() {
        for (int i = 1; i < listDosen.length; i++) {
            Dosen temp = listDosen[i];
            int j = i;
            while (j >0 && listDosen[j-1].usia < temp.usia) {
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}

package Praktikum_ASD.Jobsheet3.Praktikum03;
public class DataDosen {
    void dataSemuaDosen(Dosen1 [] arrayOfDosen) {
        int nomor = 1;
        for(Dosen1 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + nomor++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.jenisKelamin);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("=========================");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen1[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        for (Dosen1 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki   : " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan   : " + jumlahPerempuan);
    }
    void rataRataUsiaPerJenisKelamin(Dosen1[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;
        for (Dosen1 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahLakiLaki++;
                totalUsiaLakiLaki += dosen.usia;
            } else {
                jumlahPerempuan++;
                totalUsiaPerempuan += dosen.usia;
            }
        }
        System.out.println("Rata-rata usia dosen laki-laki   : " + totalUsiaLakiLaki / jumlahLakiLaki);
        System.out.println("Rata-rata usia dosen perempuan   : " + totalUsiaPerempuan / jumlahPerempuan);
    }
    void infoDosenPalingTua(Dosen1[] arrayOfDosen) {
        int usiaTertua = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaTertua) {
                usiaTertua = arrayOfDosen[i].usia;
            }
        }
        System.out.println("Dosen tertua berusia " + usiaTertua);
    }
    void infoDosenPalingMuda(Dosen1[] arrayOfDosen) {
        int usiaTermuda = 100;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaTermuda) {
                usiaTermuda = arrayOfDosen[i].usia;
            }
        }
        System.out.println("Dosen termuda berusia " + usiaTermuda);
    }
}

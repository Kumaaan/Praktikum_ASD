package BruteForceDivideQonquer.Minggu5;
public class Pangkat01 {
    int nilai, pangkat;

    Pangkat01(int n, int p) {
        nilai = n;
        pangkat = p;
    }
    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }
    int pangkatDC() {
        return hitungPangkatDC(pangkat);
    }
    private int hitungPangkatDC(int n) {
        if (n == 1) {
            return nilai;
        } else {
            int hasil = hitungPangkatDC(n / 2);
            if (n % 2 == 1) {
                return hasil * hasil * nilai;
            } else {
                return hasil * hasil;
            }
        }
    }
}
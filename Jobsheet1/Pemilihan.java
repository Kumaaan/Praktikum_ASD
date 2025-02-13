import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextDouble();
        System.out.println("======================");
        System.out.println("======================");

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (nilaiTugas < 0 || nilaiKuis < 0 || nilaiUTS < 0 || nilaiUAS < 0) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            } else {
            nilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");

            if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+") {
            System.out.println("SELAMAT ANDA LULUS");
            } else {
            System.out.println("ANDA TIDAK LULUS");
            }
            sc.close();
        }
    }
}

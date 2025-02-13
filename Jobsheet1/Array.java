import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String huruf [] = new String[8];
        byte sks [] = {2, 2, 2, 3, 2, 2, 3, 2};
        double bobot [] = new double[8];
        double nilaiAngka [] = new double[8];
        double ip, ipTotal = 0;
        String MK [] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", 
        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        System.out.println("=================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================");
        System.out.print("masukkan nilai Angka untuk MK Pancasila: ");
        nilaiAngka [0] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        nilaiAngka [1] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        nilaiAngka [2] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Matematika Dasar: ");
        nilaiAngka [3] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Bahasa Inggris: ");
        nilaiAngka [4] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        nilaiAngka [5] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        nilaiAngka [6] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        nilaiAngka [7] = sc.nextDouble();
        System.out.println("=================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=================");
        
        for (int i = 0; i < nilaiAngka.length; i++) {
        if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
            huruf[i] = "A";
            bobot[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
            huruf [i]= "B+";
            bobot [i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
            huruf [i]= "B";
            bobot [i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
            huruf [i]= "C+";
            bobot [i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
            huruf [i]= "C";
            bobot [i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
            huruf [i]= "D";
            bobot [i] = 1.00;
            } else {
            huruf [i]="E";
            bobot [i] = 0.00;
            }
        }
        System.out.println("MK\t\t\t\t\t Nilai Angka\t NilaiHuruf\t Bobot Nilai");
        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", MK[i], nilaiAngka[i], huruf[i], bobot[i]);
        }
        System.out.println("=================");
        for (int i = 0; i < bobot.length; i++) {
            ip = bobot[i] * sks[i]/18;
            ipTotal += ip;
        }
        System.out.println("IP Semester = " + ipTotal);
        sc.close();
    }
}

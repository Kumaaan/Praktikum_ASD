import java.util.Scanner;
public class Fungsi {
    static Scanner sc = new Scanner(System.in);
    static void Pendapatan(){
        String cabang [] = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        byte bunga [][] = {{10, 6, 2, 5}, {5, 11, 10, 7}, {15, 9, 10, 12}, {7, 12, 5, 9}} ;
        int pendapatan[] = new int [4];
        System.out.println("Pendapatan Setiap Cabang:");
        for (int i = 0; i< cabang.length; i++) {
            pendapatan[i] += bunga [0][i] * 75000;
            pendapatan[i] += bunga [1][i] * 50000;
            pendapatan[i] += bunga [2][i] * 60000;
            pendapatan[i] += bunga [3][i] * 10000;
            System.out.println("Royal Garden " +(i+1)+ ": " + pendapatan[i]);
        }
    }
    static void Stock(){
        String cabang [] = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        byte bunga [][] = {{10, 6, 2, 5}, {5, 11, 10, 7}, {15, 9, 10, 12}, {7, 12, 5, 9}} ;
        System.out.print("Apakah di cabang 4 terdapat bunga yang mati(y/t)? ");
        String mati = sc.nextLine();
        if (mati.equalsIgnoreCase("y") ) {
            System.out.println("\nDaftar bunga yang mati: ");
            System.out.println("Bunga Aglonema  : 1");
            System.out.println("Bunga Keladi\t: 2");
            System.out.println("Bunga Mawar\t: 5");
            bunga [0][3] -= 1;
            bunga [1][3] -= 2;
            bunga [3][3] -= 5;
        }
        System.out.println("\nStock Bunga Setiap Cabang:");
        System.out.println("Cabang\t\t    Algonema\t   Keladi\t  Alocasia\t Mawar");
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-20s", cabang[i]);
            for (int j = 0; j < bunga.length; j++) { 
                System.out.printf("%-15d", bunga[j][i]);
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        byte menu;
        do {
            System.out.println("\n============================");
            System.out.println("Menu Pilihan");
            System.out.println("============================");
            System.out.println("1. Menampilkan Pendapatan");
            System.out.println("2. Menampilkan stock");
            System.out.println("3. Keluar");
            System.out.println("============================");
            System.out.print("Masukkan nomor: ");
            menu = sc.nextByte();
            sc.nextLine();
            System.out.println(" ");
       
            switch (menu) {
                case 1: 
                    Pendapatan();
                    break;
                case 2:
                    Stock();
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    break;
                default: 
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
       
        }while (menu!=3);
    }
}

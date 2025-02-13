import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    static double inputSisi(){
        System.out.print("Masukkan sisi kubus: ");
        return sc.nextDouble();
    }
    static void VolumeKubus(){
        double sisi = inputSisi();
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
    }
    static void LuasPermukaanKubus(){
        double sisi = inputSisi();
        double luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luas);
    }
    static void KelilingKubus(){
        double sisi = inputSisi();
        double keliling = 12 * sisi;
        System.out.println("Keliling Kubus: " + keliling);
    }
    public static void main(String[] args) {
        byte menu;
        do {
            System.out.println("\n====================================");
            System.out.println("Program Operasi Bangun Kubus");
            System.out.println("====================================");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih Menu: ");
            menu = sc.nextByte();
            sc.nextLine();

            switch (menu) {
                case 1:
                    VolumeKubus();
                    break;
                case 2: 
                    LuasPermukaanKubus();
                    break;
                case 3: 
                    KelilingKubus();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        } while (menu!=4);
    }
}

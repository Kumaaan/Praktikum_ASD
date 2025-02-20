public class MataKuliahMain1 {
    public static void main(String[] args) {
        MataKuliah1 mk1 = new MataKuliah1();
        mk1.nama = "Pancasila";
        mk1.kodeMK = "001";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSks(2);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();
        System.out.println("");

        MataKuliah1 mk2 = new MataKuliah1("Matematika Dasar", "002", 2, 4);
        mk2.tampilInformasi();
        mk2.ubahSks(3); 
        mk2.tambahJam(2);
        mk2.tampilInformasi();
    }
}

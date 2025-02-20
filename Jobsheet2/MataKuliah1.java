public class MataKuliah1 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. selama " + jam + " jam.");
    }
    void kurangiJam(int jam) {
        if (jumlahJam <= jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan! Pengurang terlalu besar.");
        } else if (jam < 0){
            System.out.println("Jumlah jam tidak boleh negatif.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. selama " + jam + " jam.");
        }
    }
    public MataKuliah1() {
        
    }
    public MataKuliah1(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

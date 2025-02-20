public class DosenMain1 {
    public static void main(String[] args) {
        Dosen1 ds1 = new Dosen1();
        ds1.idDosen = "021";
        ds1.nama = "Rudi";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2010;
        ds1.bidangKeahlian = "Matematika";

        ds1.tampilInformasi(2025);
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Fisika");
        ds1.tampilInformasi(2027);
        System.out.println("");

        Dosen1 ds2 = new Dosen1("010", "Andi", true, 2000, "Bahasa Inggris");
        ds2.tampilInformasi(2030);
        ds2.setStatusAktif(false);
        ds2.ubahKeahlian("Bahasa Jepang");
        ds2.tampilInformasi(2032);
    }
}
    
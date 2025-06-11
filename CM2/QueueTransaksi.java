package CM2;

public class QueueTransaksi {
    TransaksiLayanan [] data;
    int front;
    int rear;
    int size;
    int max;

    QueueTransaksi (int max) {
        this.max = max;
        data = new TransaksiLayanan[max];
        front = -1;
        rear = -1; 
        size = 0;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahRiwayat(TransaksiLayanan transaksi) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah pasien");
            return;
        }
        if (IsEmpty()){
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        size++;
        data[rear] = transaksi;
    }
    public void tampilkanRiwayat() {
        if (IsEmpty()) {
            System.out.println("\n--Riwayat Trasaksi--");
            System.out.println("Riwayat masih kosong.");
        } else {
            System.out.println("\n--Riwayat Trasaksi--");
            System.out.println("Daftar Transaksi: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.println(data[index].pasien.nama + " (" + data[index].durasiLayanan + " jam): Rp " + data[index].hitungBiaya());
            }
        }
    }
    public void hapusRiwayatTerdepan() {
        if (size == 0) {
            System.out.println("\n--Riwayat Trasaksi--");
            System.out.println("Riwayat masih kosong.");     
        } else {
            TransaksiLayanan hapus = data[front];
            front = (front + 1) % max;
            System.out.println("\n--Menghapus Riwayat--");
            System.out.println("Data yang dihapus:");
            System.out.println("Nama Pasien : " + hapus.pasien.nama);
            System.out.println("NIK         : " + hapus.pasien.nik);
            System.out.println("Keluhan     : " + hapus.pasien.keluhan);
            System.out.println("Dilayani oleh Dokter " + hapus.dokter.nama);
            size--;
        }
    }
}

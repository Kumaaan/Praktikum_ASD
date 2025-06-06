package CM2;

public class QueueTransaksi {
    TransaksiLayanan [] data;
    int front;
    int rear;
    int size;
    int max;

    QueueTransaksi (int max) {
        this.max = max;
        this.data = new TransaksiLayanan[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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
    public void tambahAntrian(TransaksiLayanan transaksi) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = transaksi;
        size++;
        
    }
    public void tampilkanRiwayat() {
        if (IsEmpty()) {
            System.out.println("\n--Riwayat Trasaksi--");
            System.out.println("Riwayat masih kosong.");
            return;
        } 
        System.out.println("\n--Riwayat Trasaksi--");
        System.out.println("Daftar Transaksi: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println(data[index].pasien.nama + " (" + data[index].durasiLayanan + " jam): Rp " + data[index].hitungBiaya());
        }
    }
}

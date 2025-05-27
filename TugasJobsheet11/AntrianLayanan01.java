package TugasJobsheet11;
public class AntrianLayanan01 {
    NodeQueue01 front, rear;
    int size;
    int max;

    public AntrianLayanan01(int max) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.max = max;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return size >= max;
    }
    public void tambahAntrian(Mahasiswa01 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah mahasiswa baru.");
            return;
        }
        NodeQueue01 baru = new NodeQueue01(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public Mahasiswa01 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa01 mhs = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
        return mhs;
    }
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            front.data.tampilkanData();
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            rear.data.tampilkanData();
        }
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        NodeQueue01 temp = front;
        int i = 1;
        while (temp != null) {
            System.out.print(i + ". ");
            temp.data.tampilkanData();
            temp = temp.next;
            i++;
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}

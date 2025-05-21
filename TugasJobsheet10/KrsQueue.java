package TugasJobsheet10;
public class KrsQueue {
    DataMahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahMahasiswa;
    int sudahDiProses = 0;

    public KrsQueue (int max) {
        this.max = max;
        this.data = new DataMahasiswa[max];
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
    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            if (size >= 2) {
                System.out.println("Mahasiswa terdepan: ");
                System.out.println("No. NIM - NAMA - PRODI - KELAS");
                System.out.print("1. ");
                data[front].tampilkanData();
                System.out.print("2. ");
                data[front + 1].tampilkanData();
            } else {
                System.out.println("Mahasiswa terdepan: ");
                System.out.println("No. NIM - NAMA - PRODI - KELAS");
                System.out.print("1. ");
                data[front].tampilkanData();
            }
            
        }
    }
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("No. NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosong");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(DataMahasiswa mhs) {
        if (IsFull() && jumlahMahasiswa <= 30 ) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        jumlahMahasiswa++;
    }
    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling akhir: ");
            System.out.println("No. NIM - NAMA - PRODI - KELAS");
            System.out.print("1. ");
            data[rear].tampilkanData();
        }
    }
    public DataMahasiswa[] layaniMahasiswa() {
        if(IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else {
             if (size >= 2) {
                DataMahasiswa[] duaMhs = new DataMahasiswa[2];
                duaMhs[0] = data[front];
                duaMhs[1] = data[(front + 1) % max];
                front = (front + 2) % max;
                size -= 2;
                sudahDiProses += 2;
                return duaMhs;
            } else {
                DataMahasiswa[] satuMhs = new DataMahasiswa[1];
                satuMhs[0] = data[front];
                front = (front + 1) % max;
                size--;
                sudahDiProses++;
                return satuMhs;
            }
        }
    }
    public int SudahDiProses() {
        return sudahDiProses;
    }
}

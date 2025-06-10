package CM2;

public class AntrianPasien {
    NodePasien head;
    NodePasien tail;
    int size = 0;
    int max;

    AntrianPasien (int max) {
        this.max = max;
    }

    boolean isEmpty() {
        return head == null;
    }
    public void tambahPasien (Pasien data) {
        NodePasien newPasien = new NodePasien(data, null, null);
        if (size >= max) {
            System.out.println("Antrian penuh, tidak dapat menambah pasien");
        } else if (isEmpty()) {
            head = tail = newPasien;
            size++;
            System.out.println(">> Pasien masuk ke dalam antrian.");
        } else {
            tail.next = newPasien;
            newPasien.prev = tail;
            tail = newPasien;
            size++;
            System.out.println(">> Pasien masuk ke dalam antrian.");
        }
    }
    public Pasien layaniPasien() {
        Pasien data = head.data;
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat melayani pasien");
            return null;
        }
        if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        return data;
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("\n--Antrian Pasien--");
            System.out.println("Antrian masih kosong.");
            return;
        }
        System.out.println("\n--Antrian Pasien--");
        NodePasien temp = head;
        while (temp != null) {
            temp.data.tampil();
            System.out.println("");
            temp = temp.next;
        }
    }
        public int getJumlahAntrian() {
        return size;
    }
}

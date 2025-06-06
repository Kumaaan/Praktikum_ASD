package CM2;

public class AntrianPasien {
    NodePasien head;
    NodePasien tail;
    boolean isEmpty() {
        return head == null;
    }
    public void tambahPasien (Pasien data) {
        NodePasien newPasien = new NodePasien(data, null, null);
        if (isEmpty()) {
            head = tail = newPasien;
        } else {
            tail.next = newPasien;
            newPasien.prev = tail;
            tail = newPasien;
        }
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }
    public Pasien LayaniPasien() {
        Pasien data = head.data;
        if (head == tail) {
            head = tail = null;

        } else {
            head = head.next;
            head.prev = null;
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
}

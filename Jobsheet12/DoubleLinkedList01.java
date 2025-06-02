package Jobsheet12;
public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        if (current == tail) {  
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print () {
        if (!isEmpty()) {
            Node01 current = head;
            System.out.println("Isi Linked List:\t");
            while (current != null ) {
                current.data.tampil();
                current = current.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List masih kosong!");
        }
    }
    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus.");
        System.out.print("Data yang terhapus adalah: ");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus.");
        System.out.print("Data yang terhapus adalah: ");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public void add(int index, Mahasiswa01 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node01 newNode = new Node01(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }
    public void removeAfter(String keyNim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah " + keyNim + " tidak ditemukan.");
            return;
        }
        Node01 toRemove = current.next;
        if (toRemove == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toRemove.next;
            toRemove.next.prev = current;
        }
        System.out.println("Node setelah " + keyNim + " berhasil dihapus.");
        size--;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.print("Data yang dihapus: ");
            current.data.tampil();
            size--;
        }
    }
    public void getFirst() {
        if (!isEmpty()) {
            System.out.print("Data pertama: ");
            head.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }
    public void getLast() {
        if (!isEmpty()) {
            System.out.print("Data terakhir: ");
            tail.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }
        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.print("Data pada index " + index + ": ");
        current.data.tampil();
    }
    public int size() {
        return size;
    }
}
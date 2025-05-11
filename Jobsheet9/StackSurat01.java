package Jobsheet9;

public class StackSurat01 {
    Surat01[] stack;
    int top, size;

    public StackSurat01(int size) {
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size-1) {
            return true ;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true ;
        } else {
            return false;
        }
    }
    public void push (Surat01 srt) {    
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan data lagi.");
        }
    }
    public Surat01 pop () {
        if (!isEmpty()) {
            Surat01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
    public Surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulan.");
            return null;
        }
    }
    public void printCari(int hasil) {
        String keterangan = "";
        if (stack[hasil].jenisIzin == 'S') {
            keterangan = "Sakit";
        } else if (stack[hasil].jenisIzin == 'I') {
            keterangan = "Izin";
        } else {

        }
        System.out.printf("%-12s %-9s %-9s %-14s %-10d", stack[hasil].idSurat, 
        stack[hasil].namaMahasiswa, stack[hasil].kelas, keterangan, stack[hasil].durasi);
    }
    public void print() {
        String keterangan = "";
        for (int i = top; i >= 0; i--) {
            if (stack[i].jenisIzin == 'S') {
             keterangan = "Sakit";
            } else if (stack[i].jenisIzin == 'I') {
                keterangan = "Izin";
            } else {
                System.out.println("Keterangan izin tidak valid!");
            }
            System.out.printf("%-12s %-9s %-9s %-14s %-10d\n", stack[i].idSurat, 
            stack[i].namaMahasiswa, stack[i].kelas, keterangan, stack[i].durasi);
        }
    }
}

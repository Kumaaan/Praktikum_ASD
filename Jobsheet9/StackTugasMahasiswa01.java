package Jobsheet9;

public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int top, size;

    public StackTugasMahasiswa01(int size) {
        this.size = size;
        stack = new Mahasiswa01[size];
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
    public void push (Mahasiswa01 mhs) {    
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa01 pop () {
        if (!isEmpty()) {
            Mahasiswa01 m = stack[top];
            top--;
            System.out.printf("Surat %s sudah diterima.");
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulan.");
            return null;
        }
    }
    public Mahasiswa01 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulan.");
            return null;
        }
    }
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public int total() {
        if (!isEmpty()) {
            return top +1;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulan.");
            return 0;
        }
    }
    public String konversiDesimalBiner(int nilai) {  
        StackKonversi01 stack = new StackKonversi01();  
        while (nilai != 0) {    
            int sisa = nilai % 2;    
            stack.push(sisa);                          
            nilai = nilai / 2;
        }
        String biner = new String();  
        while (!stack.isEmpty()) {  
            biner += stack.pop();
        }
        return biner;    
    }
}

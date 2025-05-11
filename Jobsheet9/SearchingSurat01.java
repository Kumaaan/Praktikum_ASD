package Jobsheet9;

public class SearchingSurat01 {
    public int searchingSurat(StackSurat01 stack, String cariNama, int size) {
        int posisi = -1;
        for (int j = 0; j <= stack.top; j++) {
            if (stack.stack[j].namaMahasiswa.equalsIgnoreCase(cariNama)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
}

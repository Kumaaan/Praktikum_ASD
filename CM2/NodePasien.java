package CM2;

public class NodePasien {
    Pasien data;
    NodePasien next;
    NodePasien prev;

    public NodePasien(Pasien data, NodePasien next, NodePasien prev) {

        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

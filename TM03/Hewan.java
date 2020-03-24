public class Hewan {
    private String id;
    private String pemilik;
    private boolean statusPenitipan;

    String info() {
        return setId(pemilik);
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    boolean status() {
        return statusPenitipan;
    }
}
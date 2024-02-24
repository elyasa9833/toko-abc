public class ATK {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;
    
    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "kodeBarang = " + kodeBarang + ", jenisBarang = " + jenisBarang + ", namaBarang = "
                + namaBarang + ", stok = " + stok;
    }

    
}

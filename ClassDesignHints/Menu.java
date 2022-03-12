package ClassDesignHints;

/**
 *
 * @author Fardan
 */
public class Menu {
    // Instance variables (state atau data fields)
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    // Constructor
    public Menu() {
        // Initialize data
        this.nama_makanan = "";
        this.harga_makanan = 0;
        this.stok = 0;
    }
    
    // Accessor dan mutator
    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
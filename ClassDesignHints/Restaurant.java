package ClassDesignHints;

/**
 *
 * @author Fardan
 */
public class Restaurant {
    // Instance variables (states / data fields)
    private Menu[] DaftarMenu;
    public static byte id=0;
    
    // Accessor dan mutator
    public Menu[] getDaftarMenu() {
        return DaftarMenu;
    }

    public void setDaftarMenu(Menu[] DaftarMenu) {
        this.DaftarMenu = DaftarMenu;
    }
    
    // Constructor
    public Restaurant() {
        DaftarMenu = new Menu[10];
        for( int i=0; i<10; i++) {
            DaftarMenu[i] = new Menu();
        }
    }
    
    // Behaviors / methods
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.DaftarMenu[id].setNama_makanan(nama);
        this.DaftarMenu[id].setHarga_makanan(harga);
        this.DaftarMenu[id].setStok(stok);
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(DaftarMenu[i].getNama_makanan() +"["
                        +DaftarMenu[i].getStok()+"]"+"\tRp. "+DaftarMenu[i].getHarga_makanan());
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(DaftarMenu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
    
    public void pesanMakanan (String nama, int jumlahPesanan) {
        System.out.println("Pesan: " + nama + " " + jumlahPesanan);

        updateStok(nama, jumlahPesanan);
    }
    
    public void updateStok (String nama, int jumlahPesanan) {
        for( int i=0; i<10; i++) {
            if( nama.equals(DaftarMenu[i].getNama_makanan()) ) {
                DaftarMenu[i].setStok(DaftarMenu[i].getStok()-jumlahPesanan);
            }
        }
    }
}
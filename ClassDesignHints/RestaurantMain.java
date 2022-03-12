package ClassDesignHints;

/**
 *
 * @author Fardan
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println();
        
        menu.pesanMakanan("Bala-Bala", 2);
        menu.pesanMakanan("Gehu", 3);
        menu.pesanMakanan("Molen", 5);
        System.out.println();
        
        System.out.println("Update Stok Daftar Menu");
        menu.tampilMenuMakanan();
    }
    
}

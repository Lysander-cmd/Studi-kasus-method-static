
package laundry;


public class Laundry {

    
    public static void main(String[] args) {
        //Mengoutputkan method main
        System.out.println("Selamat datang di laundry");
        //Pemberian objek untuk pemanggilan dengan objek "oke"
        method ok = new method();
        //Pemanggilan method novoid
        System.out.println(ok.awal);
        //Pemanggilan method Static yang berada pada satu class
        harga();
        //Pemanggilan method static yang berbeda class
        method.Input();
        //Pemanggilan method void
        ok.akhir();
    }
        //Method static yanng berada pada satu class
    static void harga(){
        System.out.println("Baju : ");
        System.out.println("1. Cuci  kering lipat Rp.30000");
        System.out.println("2. Cuci kering setrika Rp.50000");
        System.out.println("3. Setrika Rp.20000");
        System.out.println("4. Cuci Sepatu Rp.15000");
        System.out.println("5. Cuci Perlengkapan bayi Rp.50000");
    }
}

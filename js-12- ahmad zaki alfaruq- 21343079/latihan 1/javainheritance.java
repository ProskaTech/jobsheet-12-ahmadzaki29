package latihan1;

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class javainheritance {
     public static void main(String[]args)
    {
        // membuat objeck kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        // membuat object kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
    


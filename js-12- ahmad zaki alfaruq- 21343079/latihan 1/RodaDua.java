package latihan1;

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class RodaDua extends kendaraan {
     double NaikHargaKe = 0.20; //0.2 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, Harga sepeda menjadi Rp." + hargaDasar);
    }
}
    


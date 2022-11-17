package latihan1;

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class RodaEmpat extends kendaraan {
    double NaikHargaKe = 8; //1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp." + hargaDasar);
    }
}
    


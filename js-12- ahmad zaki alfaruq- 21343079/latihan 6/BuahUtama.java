package latihan6;

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class BuahUtama {
    public static void main(String[] args) {
        //Menggunakan constructor untuk meginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        //Menggunakan getter ke nilai
        System.out.println("Nama Buah: " + Apel.getName() + "\nHarga : "
                           + Apel.getPrice() + "\nWarna : " + Apel.getColor());
        //Update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");
        //Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: " + Apel.getName() + "\nHarga : "
                           + Apel.getPrice() + "\nWarna : " + Apel.getColor());
    }
}
    

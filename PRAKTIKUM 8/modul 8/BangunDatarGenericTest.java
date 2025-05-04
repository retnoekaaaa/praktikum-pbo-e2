/*
 * Nama File   : BangunDatarGenericTest.java
 * Deskripsi   : Main class untuk bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 1 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg= 
            new BangunDatarGeneric<Lingkaran>();
        bdg.set(L);
        System.out.println("Keliling lingkaran :" +bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
    }
}

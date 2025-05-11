/*
 * Nama File   : Main.java
 * Deskripsi   : Program utamas
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 10 Mei 2025
*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        Persegi P = new Persegi(5);
        Segitiga s = new Segitiga(3,5,6);
        PersegiPanjang pp = new PersegiPanjang(5,3);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        BangunDatarGeneric<Persegi> per = new BangunDatarGeneric<Persegi>();
        per.set(P);
        BangunDatarGeneric<Segitiga> sgt = new BangunDatarGeneric<Segitiga>();
        sgt.set(s);
        BangunDatarGeneric<PersegiPanjang> perpan = new BangunDatarGeneric<PersegiPanjang>();
        perpan.set(pp);
        

        
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("luas lingkaran : " + bdg.hitungluas());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
        System.out.println("\n");
        
        System.out.println("keliling lingkaran : " +per.hitungKeliling());
        System.out.println("luas lingkaran : " + per.hitungluas());
        System.out.println("tipe generic : " + per.get().getClass().getName());
        System.out.println("\n");
        
        System.out.println("keliling lingkaran : " +sgt.hitungKeliling());
        System.out.println("luas lingkaran : " + sgt.hitungluas());
        System.out.println("tipe generic : " + sgt.get().getClass().getName());
        System.out.println("\n");
        
        System.out.println("keliling lingkaran : " +perpan.hitungKeliling());
        System.out.println("luas lingkaran : " + perpan.hitungluas());
        System.out.println("tipe generic : " + perpan.get().getClass().getName());
        System.out.println("\n");
        
        
    }
    
}

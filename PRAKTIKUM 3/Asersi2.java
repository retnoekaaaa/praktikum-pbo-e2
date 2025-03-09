/* Nama file: Asersi2.java
 * Deskripsi: 
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 6 Maret 2025 */

 //class Lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
 }

 //class Asersi2
 public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert (jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
 }

/*Sebaiknya tidak menggunakan asersi karena asersi digunakan untuk memeriksa keaadaan yang tidak normal,
 * kalau kasusnya seperti ini menurut saya lebih baik menggunakan if else*/
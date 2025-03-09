/* Nama file: Asersi1.java
 * Deskripsi: program untuk menunjukkan asersi
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 6 Maret 2025 */

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert (x < 0):"ada kesalahan kode";
            System.out.println(("x bilangan negatif"));
        }
    }
}
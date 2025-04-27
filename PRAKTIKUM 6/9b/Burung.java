/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas turunan dari Anabul untuk Burung
 *  Nama/Nim    : Retno Eka Triatry/ 24060123140188
 *  Tanggal     : 27 April 2025
 */

public class Burung extends Anabul {
 
     public Burung(String nama) {
         super(nama);
     }
 
     @Override
     public void bersuara() {
         System.out.println("Cuit!");
     }
 
     @Override
     public void bergerak() {
         System.out.println("Terbang di udara.");
     }
}
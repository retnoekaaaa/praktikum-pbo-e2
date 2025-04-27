/*  Nama File   : Kucing.java
 *  Deskripsi   : Kelas turunan dari Anabul untuk Kucing
 *  Nama/Nim    : Retno Eka Triatry/ 24060123140188
 *  Tanggal     : 27 April 2025
 */

public class Kucing extends Anabul {
 
     public Kucing(String nama) {
         super(nama);
     }
 
     @Override
     public void bersuara() {
         System.out.println("Meong!");
     }
 
     @Override
     public void bergerak() {
         System.out.println("Melata dengan lincah.");
     }
} 
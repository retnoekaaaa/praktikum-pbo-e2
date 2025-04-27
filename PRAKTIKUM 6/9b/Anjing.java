/*  Nama File   : Anjing.java
 *  Deskripsi   : Kelas turunan dari Anabul untuk Anjing
 *  Nama/Nim    : Retno Eka Triatry/ 24060123140188
 *  Tanggal     : 27 April 2025
 */

public class Anjing extends Anabul {
 
     public Anjing(String nama) {
         super(nama);
     }
 
     @Override
     public void bersuara() {
         System.out.println("Guk-guk!");
     }
 
     @Override
     public void bergerak() {
         System.out.println("Melata dengan cepat.");
     }
}
 
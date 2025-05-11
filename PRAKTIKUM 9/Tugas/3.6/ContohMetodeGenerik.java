/**
 * File         : ContohMetodeGenerik.java
 * Deskripsi    : Contoh metode generik untuk menampilkan perilaku objek turunan Anabul
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 010 Mei 2025
 */

public class ContohMetodeGenerik {
  public static <T extends Anabul> void tampilkanperilaku(Datum<T> data){
      T anabul = data.getIsi();
      anabul.gerak();
      anabul.bersuara();
  }  
}

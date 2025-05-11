/**
 * File         : KoleksiAnabul.java
 * Deskripsi    : Kelas generik untuk menyimpan dan menampilkan koleksi objek Anabul
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

import java.util.ArrayList;
public class KoleksiAnabul <T extends Anabul> {
    private ArrayList<T> koleksi = new ArrayList<>();
    
    public void tambah(T item){
        koleksi.add(item);
    }
    
   public ArrayList<T> getKoleksi(){
       return koleksi;
   }
   
   public void setKoleksi(ArrayList<T> koleksi){
       this.koleksi = koleksi;
   }
    
    public void showAll(){
        for (T item : koleksi){
            System.out.println("nama : " + item.getNama());
            item.gerak();
            item.bersuara();
            System.out.println();
        }
    }
}

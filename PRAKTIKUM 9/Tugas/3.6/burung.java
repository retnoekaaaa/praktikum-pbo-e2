/**
 * File         : burung.java
 * Deskripsi    : Representasi kelas turunan dari Anabul, yaitu Burung
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public class burung extends Anabul {
    public burung (String nama){
        super(nama);
    }
    
    @Override 
    public void gerak(){
        System.out.println(getNama() + "bergerak dengan cara terbang");
    }
    
    @Override
    public void bersuara(){
        System.out.println(getNama() + "bersuara : CIT CIT");
    }
}

/**
 * File         : Anjing.java
 * Deskripsi    : Representasi kelas turunan dari Anabul, yaitu Anjing
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(getNama() + "bergerak dengan cara melata");
    }
    
    @Override
    public void bersuara(){
        System.out.println(getNama() + "bersuara : GUK-GUK");
    }
}

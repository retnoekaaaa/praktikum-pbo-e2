/**
 * File         : kucing.java
 * Deskripsi    : Representasi kelas turunan dari Anabul, yaitu Kucing
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public class kucing extends Anabul{
    public kucing(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(getNama() + "bergeraknya dengan cara melata");
    }
    
    @Override
    public void bersuara(){
        System.out.println(getNama() + "bersuara : meong");
    }
}

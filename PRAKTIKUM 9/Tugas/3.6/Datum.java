/**
 * File         : Datum.java
 * Deskripsi    : Kelas generic yang menyimpan satu objek bertipe T
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public class Datum<T>{
    private T isi;
    
    public Datum(T isi){
        this.isi = isi;
    }
    
    public T getIsi(){
        return isi;
    }
    
    public void setIsi(T isi){
        this.isi = isi;
    }
}

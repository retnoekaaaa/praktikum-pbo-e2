/**
 * File         : Anabul.java
 * Deskripsi    : Kelas abstrak yang merepresentasikan hewan peliharaan (Anabul)
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    
    public abstract void gerak();
    public abstract void bersuara();
    
    
}

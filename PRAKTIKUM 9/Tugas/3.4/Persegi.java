/*
 * Nama File   : Persegi.java
 * Deskripsi   : Implementasi persegi sebagai bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 10 Mei 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    @Override 
    public double hitungLuas(){
        return sisi*sisi;
    }
}

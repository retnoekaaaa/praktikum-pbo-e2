/*
 * Nama File   : Lingkaran.java
 * Deskripsi   : Implementasi Lingkaran sebagai bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 10 Mei 2025
*/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    @Override 
    public double hitungLuas(){
        return 2*jejari*3.14;
    }
}
 
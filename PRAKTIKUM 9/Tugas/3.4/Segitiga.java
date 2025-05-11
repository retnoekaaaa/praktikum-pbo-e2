/*
 * Nama File   : Segitiga.java
 * Deskripsi   : Implementasi Segitiga sebagai bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 10 Mei 2025
*/

public class Segitiga extends BangunDatar {
    private double alas,tinggi,sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    
    @Override 
    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }
    @Override 
    public double hitungKeliling(){
        return alas*tinggi*sisiMiring;
    }
}

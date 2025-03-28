// Nama: Retno Eka Triatry 
// Nim: 24060123140188
// Tanggal : 13 Maret 2025

abstract class BangunDatar {
    public abstract double getLuas();
    public abstract double getKeliling();
    
    public boolean isEqualLuas(BangunDatar bd) {
        return this.getLuas() == bd.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar bd) {
        return this.getKeliling() == bd.getKeliling();
    }
}
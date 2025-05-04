/*
 * Nama File   : BangunDatarGeneric.java
 * Deskripsi   : Kelas konstruksi untuk BangunDatar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 1 Mei 2025
*/

public class BangunDatarGeneric < T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;

    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

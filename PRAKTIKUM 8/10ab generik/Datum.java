/*
 * Nama File   : Datum.java
 * Deskripsi   : Kelas abstrak untuk bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 3 Mei 2025
*/

public class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}
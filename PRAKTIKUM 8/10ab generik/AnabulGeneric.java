/*
 * Nama File   : AnabulGeneric.java
 * Deskripsi   : Kelas abstrak untuk bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 3 Mei 2025
*/

public class AnabulGeneric {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        datum.getIsi().suara();
        datum.getIsi().gerak();
    }
}
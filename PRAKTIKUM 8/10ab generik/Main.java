/*
 * Nama File   : Main.java
 * Deskripsi   : Kelas abstrak untuk bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 3 Mei 2025
*/

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> dKucing = new Datum<>();
        dKucing.setIsi(new Kucing());

        Datum<Anjing> dAnjing = new Datum<>();
        dAnjing.setIsi(new Anjing());

        Datum<Burung> dBurung = new Datum<>();
        dBurung.setIsi(new Burung());

        System.out.println("Simulasi Kucing:");
        AnabulGeneric.tampilkanPerilaku(dKucing);

        System.out.println("\nSimulasi Anjing:");
        AnabulGeneric.tampilkanPerilaku(dAnjing);

        System.out.println("\nSimulasi Burung:");
        AnabulGeneric.tampilkanPerilaku(dBurung);
    }
}
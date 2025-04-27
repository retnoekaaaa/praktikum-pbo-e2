/* Nama file: Pegawai.java
 * Deskripsi:
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 25 Maret 2025 */

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
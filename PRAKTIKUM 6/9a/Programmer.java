/* Nama file: Programmer.java
 * Deskripsi:
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 25 Maret 2025 */

class Programmer extends Pegawai {
    private int bonus = 4500000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

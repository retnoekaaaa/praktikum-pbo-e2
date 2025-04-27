/* Nama file: Manager.java
 * Deskripsi:
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 25 Maret 2025 */

class Manager extends Pegawai {
    private int tunjangan = 7000000;

    public Manager(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
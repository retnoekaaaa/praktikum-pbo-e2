//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public class DosenTetap extends Dosen {
    private String nidn;
    private String tanggalBatasUsiaPensiun;

    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, 
                      String tmtBekerja, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas, 65);
        this.nidn = nidn;
        this.tanggalBatasUsiaPensiun = hitungTanggalPensiun(tanggalLahir);
    }

    @Override
    public void printInfo() {
        String masaKerja = hitungMasaKerja();
        double tunjangan = gajiPokok * 0.02 * (Integer.parseInt(masaKerja.split(" ")[0]));

        System.out.println("===== Dosen Tetap =====");
        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmtBekerja));
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Masa Kerja\t: " + masaKerja);
        System.out.println("BUP\t\t: " + formatTanggal(tanggalBatasUsiaPensiun));
        System.out.println("Gaji Pokok\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t: 2% x " + 
            Integer.parseInt(masaKerja.split(" ")[0]) + 
            " x " + formatRupiah(gajiPokok) + 
            " = " + formatRupiah(tunjangan));
    }
}
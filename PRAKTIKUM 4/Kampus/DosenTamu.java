//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public class DosenTamu extends Dosen {
    private String nidk;
    private String tanggalAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, 
                     String tmtBekerja, double gajiPokok, String fakultas, 
                     String tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas, 0);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    private int hitungSisaMasaKontrak() {
        String[] kontrakSplit = tanggalAkhirKontrak.split("-");
        int tahunKontrak = Integer.parseInt(kontrakSplit[0]);
        int bulanKontrak = Integer.parseInt(kontrakSplit[1]);

        return (tahunKontrak - 2025) * 12 + (bulanKontrak - 3);
    }

    @Override
    public void printInfo() {
        String masaKerja = hitungMasaKerja();
        double tunjangan = gajiPokok * 0.025;

        System.out.println("===== Dosen Tamu =====");
        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDK\t\t: " + nidk);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmtBekerja));
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Masa Kerja\t: " + masaKerja);
        System.out.println("Masa Kontrak Berakhir: " + hitungSisaMasaKontrak() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t: 2,5% x " + formatRupiah(gajiPokok) + 
                           " = " + formatRupiah(tunjangan));
    }
}
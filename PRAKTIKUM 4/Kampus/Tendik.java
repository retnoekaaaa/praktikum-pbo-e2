//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public class Tendik extends Pegawai {
    private String bidang;
    private String tanggalBatasUsiaPensiun;

    public Tendik(String nip, String nama, String tanggalLahir, 
                  String tmtBekerja, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.bidang = bidang;
        this.tanggalBatasUsiaPensiun = hitungTanggalPensiun(tanggalLahir);
    }

    private String hitungTanggalPensiun(String tanggalLahir) {
        String[] parts = tanggalLahir.split("-");
        int tahun = Integer.parseInt(parts[0]) + 55;
        int bulan = Integer.parseInt(parts[1]);
        
        if (bulan == 12) {
            tahun++;
            bulan = 1;
        } else {
            bulan++;
        }
        
        return tahun + "-" + (bulan < 10 ? "0" + bulan : bulan) + "-01";
    }

    @Override
    public void printInfo() {
        String masaKerja = hitungMasaKerja();
        double tunjangan = gajiPokok * 0.01 * (Integer.parseInt(masaKerja.split(" ")[0]));

        System.out.println("===== Tendik =====");
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmtBekerja));
        System.out.println("Jabatan\t\t: Tenaga Kependidikan (Tendik)");
        System.out.println("Bidang\t\t: " + bidang);
        System.out.println("Masa Kerja\t: " + masaKerja);
        System.out.println("BUP\t\t: " + formatTanggal(tanggalBatasUsiaPensiun));
        System.out.println("Gaji Pokok\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t: 1% x " + 
            Integer.parseInt(masaKerja.split(" ")[0]) + 
            " x " + formatRupiah(gajiPokok) + 
            " = " + formatRupiah(tunjangan));
    }
}
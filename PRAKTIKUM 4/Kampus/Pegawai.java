//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected String tanggalLahir;
    protected String tmtBekerja;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmtBekerja = tmtBekerja;
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        String[] tmtSplit = tmtBekerja.split("-");
        int tmtTahun = Integer.parseInt(tmtSplit[0]);
        int tmtBulan = Integer.parseInt(tmtSplit[1]);

        int tahunSekarang = 2025;
        int bulanSekarang = 3;

        int totalBulan = (tahunSekarang - tmtTahun) * 12 + (bulanSekarang - tmtBulan);
        int tahun = totalBulan / 12;
        int bulan = totalBulan % 12;

        return tahun + " tahun " + bulan + " bulan";
    }

    protected String formatRupiah(double nominal) {
        String strNominal = String.valueOf((long)nominal);
        StringBuilder result = new StringBuilder("Rp ");
        
        int panjang = strNominal.length();
        for (int i = 0; i < panjang; i++) {
            result.append(strNominal.charAt(i));
            if ((panjang - i - 1) % 3 == 0 && i < panjang - 1) {
                result.append(".");
            }
        }
        result.append(",00");
        
        return result.toString();
    }

    protected String formatTanggal(String tanggal) {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        String[] parts = tanggal.split("-");
        int hari = Integer.parseInt(parts[2]);
        int indexBulan = Integer.parseInt(parts[1]) - 1;
        int tahun = Integer.parseInt(parts[0]);
        
        return hari + " " + bulan[indexBulan] + " " + tahun;
    }

    public abstract void printInfo();
}
//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public abstract class Dosen extends Pegawai {
    protected String fakultas;
    protected int batasUsiaPensiun;

    public Dosen(String nip, String nama, String tanggalLahir, String tmtBekerja, 
                 double gajiPokok, String fakultas, int batasUsiaPensiun) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.fakultas = fakultas;
        this.batasUsiaPensiun = batasUsiaPensiun;
    }

    protected String hitungTanggalPensiun(String tanggalLahir) {
        String[] parts = tanggalLahir.split("-");
        int tahun = Integer.parseInt(parts[0]) + batasUsiaPensiun;
        int bulan = Integer.parseInt(parts[1]);
        
        if (bulan == 12) {
            tahun++;
            bulan = 1;
        } else {
            bulan++;
        }
        
        return tahun + "-" + (bulan < 10 ? "0" + bulan : bulan) + "-01";
    }
}

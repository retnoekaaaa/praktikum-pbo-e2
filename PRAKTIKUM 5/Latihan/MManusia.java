/*  Nama File   : MManusia.java
 *  Deskripsi   : Driver program untuk menguji implementasi dari kelas PNS, Pengusaha, dan Petani yang telah dibuat sebelumnya.
 *  Pembuat     : Retno Eka Triatry / 24060123140188
 *  Tanggal     : 23 Maret 2025
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Zayn Malique", LocalDate.of(2006, 4, 1), "Jl. Menuju Kenangan", 15000000, "198302032006041233");
        pengusaha pe1 = new pengusaha("Tom Hardy", LocalDate.of(2000, 1, 1), "Jl. Bunga Kamboja", 55000000, "000-123-456-789-000-1");
        petani pt1 = new petani("Kim Mignyu", LocalDate.of(1977, 1, 9), "Jl. Gang Buntu", 5000000, "Busan");
        PNS p2 = new PNS("Panji Petualang", LocalDate.of(2010, 4, 1), "Jl. Lele aja", 10000000, "1980042120100415466");
        p2.setAlamat("Jl. Lele aja");

        //OUTPUT JUMLAH OBJEK
        System.out.println("Jumlah Manusia     = " + manusia.getCounterMns());
        System.out.println("Jumlah PNS         = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha   = " + pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani      = " + petani.getCounterPetani());

        //OUTPUT PAJAK
        System.out.println("Pajak PNS p1       = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1   = " + pt1.hitungPajak());

        //OUTPUT MASA KERJA
        System.out.println("Masa Kerja p1      = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1     = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1     = " + pt1.hitungMasaKerja() + " tahun");

        //CETAK INFORMASI
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        p2.cetakInfo();
    }
}
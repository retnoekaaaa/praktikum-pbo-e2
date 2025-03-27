//Nama :Retno Eka Triatry
//Nim/ Kelas : 24060123140188/ E
//Tanggal : 15 Maret 2025

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Syahla", "1990-05-05", 
            "2015-01-01", 5_000_000, "Fakultas Sains dan Matematika");
        dosenTetap.printInfo();

        System.out.println("\n");

        DosenTamu dosenTamu = new DosenTamu( "9876543210", "12345678",  "Nara", "1990-03-15", 
            "2020-07-01", 4_500_000, "Fakultas Sains dan Matematika","2025-12-31");
        dosenTamu.printInfo();

        System.out.println("\n");

        Tendik tendik = new Tendik("1023456789", "Anin",  "2000-05-05", "2015-07-01", 5_000_000, "Akademik");
        tendik.printInfo();
    }
}
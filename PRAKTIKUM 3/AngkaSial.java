/* Nama file: AngkaSial.java
 * Deskripsi:
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 6 Maret 2025 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            //methid getMessage() telah ada pada class "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}
/* 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * jawaban: Tidak. Baris 12 adalah as.cobaAngka(12), tetapi sebelum sampai ke sana, saat as.cobaAngka(13)
 * dipanggil, terjadi exception. Karena eksepsi dilempar, eksekusi langsung melompat ke blok catch, 
 * sehingga as.cobaAngka(12) tidak akan dieksekusi.
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * jawaban: Ya. Baris 21 (System.out.println("hati hati memasukkan angka!!!");) ada dalam blok catch, 
 * yang akan dijalankan ketika exception terjadi.
 * Setelah as.cobaAngka(13) melempar AngkaSialException, program langsung masuk ke blok catch, dan baris ini dieksekusi.*/
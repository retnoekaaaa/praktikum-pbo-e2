/**
 * File         : Main.java
 * Deskripsi    : Program utama untuk menguji kelas koleksi dengan tipe data Character
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koleksi<Character> KK = new koleksi<>(10);
        
        //tambah elemem 
        KK.add('E');
        KK.add('K');
        KK.add('R');
        KK.add('A');
        KK.add('W');
        KK.add('R');
        
        //menampilkan elemen
        System.out.println("isi koleksi : ");
        KK.showAll();
        
        //edit elemen pada index
        KK.setIsi(3, 'A');
        System.out.println("setelah koleksi di edit : ");
        KK.showAll();
        
        //menghapus elemen 
        KK.delete(5);
        System.out.println("setelah elemen di delete : ");
        KK.showAll();

    }
    
}

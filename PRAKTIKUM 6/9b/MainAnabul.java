/*  Nama File   : MainAnabul.java
 *  Deskripsi   : Program utama untuk menampilkan perilaku anabul
 *  Nama/Nim    : Retno Eka Triatry/ 24060123140188
 *  Tanggal     : 27 April 2025
 */

import java.util.ArrayList;
 
public class MainAnabul {
     public static void main(String[] args) {
         // Membuat objek Anabul
         Anabul burung1 = new Burung("Ica");
         Anabul burung2 = new Burung("Jeje");
         Anabul burung3 = new Burung("Pluto");
 
         Anabul anjing1 = new Anjing("Goki");
         Anabul anjing2 = new Anjing("Loki");
         Anabul anjing3 = new Anjing("Oreo");
 
         Anabul kucing1 = new Kucing("Kiyo");
         Anabul kucing2 = new Kucing("Yuki");
         Anabul kucing3 = new Kucing("Moji");

         ArrayList<Anabul> daftarHewan = new ArrayList<>();
         daftarHewan.add(burung1);
         daftarHewan.add(burung2);
         daftarHewan.add(burung3);
         daftarHewan.add(anjing1);
         daftarHewan.add(anjing2);
         daftarHewan.add(anjing3);
         daftarHewan.add(kucing1);
         daftarHewan.add(kucing2);
         daftarHewan.add(kucing3);

         for (Anabul hewan : daftarHewan) {
             hewan.tampilkanInfo();
         }
     }
}

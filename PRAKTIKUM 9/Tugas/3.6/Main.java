/**
 * File         : Main.java
 * Deskripsi    : Program utama untuk menampilkan perilaku acak dari berbagai jenis Anabul
 * Pembuat      : Retno Eka Triatry
 * NIM          : 24060123140188
 * Tanggal      : 10 Mei 2025
 */

 import java.util.Random;

 public class Main {
     public static void main(String[] args) {
         KoleksiAnabul<Anabul> Koleksi = new KoleksiAnabul<>();
         Random rand = new Random();
         
         for (int i = 0 ; i<10; i++){
             int tipe = rand.nextInt(3);
             switch (tipe){
                 case 0:
                     Koleksi.tambah(new kucing("kucing"));
                     break;
                 case 1:
                     Koleksi.tambah(new Anjing("anjing"));
                     break;
                 case 2:
                     Koleksi.tambah(new burung("burung"));
                     break;
             }
         }
         Koleksi.showAll();
  }
 }
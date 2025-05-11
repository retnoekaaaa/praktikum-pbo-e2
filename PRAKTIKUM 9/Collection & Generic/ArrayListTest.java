/**
 *  Nama file    : ArrayListTest.java
 * Deskripsi    : Program menggunakan objek ArrayList sebagai colection class
 * Nama/Nim     : Retno Eka Triatry/ 24060123140188
 * Tanggal      : 9 Mei 2025 */ 
 
 import java.util.ArrayList;

 public class ArrayListTest{
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // ierasi pada keseluruhan ArrayList
        for(String s: strings){
            System.out.print(s + " ");
        }
    }
 }
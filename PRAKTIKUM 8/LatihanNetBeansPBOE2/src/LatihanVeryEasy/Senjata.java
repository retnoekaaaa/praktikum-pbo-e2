/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Nama File   : Senjata.java
 * Deskripsi   : Kelas abstrak untuk bangun datar
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 3 Mei 2025
*/

package LatihanVeryEasy;

/**
 *
 * @author kaaeyy
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(getBunyi());
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis");
        }
    }
}
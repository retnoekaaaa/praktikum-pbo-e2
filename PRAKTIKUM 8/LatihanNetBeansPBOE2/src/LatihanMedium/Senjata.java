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

package LatihanMedium;

/**
 *
 * @author kaaeyy
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    public int getPeluru() {
        return peluru;
    }

    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
}

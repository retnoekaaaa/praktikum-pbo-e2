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

package LatihanTutorial;

/**
 *
 * @author kaaeyy
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    private void setBunyi (String bunyi){
        this.bunyi = bunyi;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(getBunyi()+ " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
    
    public String menusuk(){
        if (isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}

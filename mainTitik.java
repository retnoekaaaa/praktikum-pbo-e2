//nama file: mainTitik.java
// Deskripsi: berisi atribut dan method dalam class Titik
// Pembuat: Retno Eka Triatry
// Tanggal: 20-02-2025

//import Titik;

public class mainTitik {
    public static void main(String[] args) {
        //membuat objek dengan titik (0, 0)
        Titik T1 = new Titik();
        System.out.println("--- MEMBUAT OBJEK TITIK---");
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Jarak Ke Pusat: " + T1.getjarakPusat());

        //Mengubah nilai absis da ordinat 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("\n---SETELAH NILAI DI UBAH---");
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Jarak Ke Pusat: " + T1.getjarakPusat());

        //Membuat objek T2 ()
        Titik T2 = new Titik(6,6);
        System.out.println("\n---TITIK T2---");
        T2.printTitik();
        System.out.println("Jarak antara T1 dan T2:" + T1.getJarak(T2));
        
        //menggeser T1 
        T1.geser(4, 4);
        System.out.println("\n --- T1 SETELAH DIGESER---");
        T1.printTitik();

        //refleksi T1 terhadap sumbu x 
        T1.refleksiX();
        System.out.println("\n---SETELAH REFLEKSI SUMBU X---");
        T1.printTitik();

        //Refleksi terhadap sumbu y 
        T1.refleksiY();
        System.out.println("\n---SETELAH REFLEKSI SUMBU Y---");
        T1.printTitik();

        //membuat objek baru dengan hasil relfkesi t1 terhadap sumbu x 
        Titik T3 = T1.getRefleksiX();
        System.out.println("\n---TITIK T3---");
        T3.printTitik();

        //membuat objek baru dengan hasil relfkesi dari t1 terhadap sumbu y 
        Titik T4 = T1.getRefleksiY();
        System.out.println("\n---TITIK T4---");
        T4.printTitik();

        //menampilkna total titik yang pernah di buat 
        System.out.println("\n---TOTAL TITIK YANG DIBUAT:" + Titik.getCounterTitik());

    }
 }
//nama file: Garis.java
// Deskripsi: berisi atribut dan method dalam class garis
// Pembuat: Retno Eka Triatry
// Tanggal: 20-02-2025

// Garis.java
public class Garis {
    /****** Atribut *******/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /****** Method ******/
    // Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter untuk counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) +
                         Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / 
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Method untuk mendapatkan titik tengah
    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Method untuk mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Method untuk mencetak persamaan garis
    public void printPersamaanGaris() {
        double gradien = getGradien();
        double intercept = titikAwal.getOrdinat() - gradien * titikAwal.getAbsis();
        System.out.println("Persamaan garis: y = " + gradien + "x + " + intercept);
    }
}
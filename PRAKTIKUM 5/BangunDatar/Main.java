public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());

        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());

        System.out.println("Apakah luas sama? " + persegi.isEqualLuas(lingkaran));
        System.out.println("Apakah keliling sama? " + persegi.isEqualKeliling(lingkaran));

        // Menggunakan interface IResize
        IResize resizePersegi = (IResize) persegi;
        IResize resizeLingkaran = (IResize) lingkaran;
        
        resizePersegi.zoomIn(2);
        resizeLingkaran.zoomOut(2);
        
        System.out.println("Luas Persegi setelah zoomIn: " + persegi.getLuas());
        System.out.println("Luas Lingkaran setelah zoomOut: " + lingkaran.getLuas());
    }
}

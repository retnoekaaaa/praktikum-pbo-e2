//nama file: Titik.java
// Deskripsi: berisi atribut dan method dalam class Titik
// Pembuat: Retno Eka Triatry
// Tanggal: 20-02-2025


 public class Titik {
 
    //atibut
    private double absis;
    private double ordinat;
    private  static int counterTitik = 0 ;

    //method
    public Titik(){
       absis = 0;
       ordinat = 0;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalika nilai absis 
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat 
    public double getOrdinat() {
        return ordinat;
    }

    //menggeser absis titik degan nilai baru x 
    public void setAbsis(double x){
        absis = x;
    }

    //menggeser absis titik degan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y 
    public void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat +x;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat+")");
    }
    
    //mengembalikan nilai counter titik
    public static int getCounterTitik (){
        return counterTitik;
    }

    //kuadran 
    public int  getKuadran (){
        if (absis >0 && ordinat >0) {
            return 1;
        }else if ( absis < 0  && ordinat > 0){
            return 2;
        }else if (absis > 0 && ordinat < 0){
            return 3;
        }else if (absis < 0 && ordinat < 0){
            return 4;
        }else {
            return 0;
        }
    }

    //jarak dari titik lain 
    public double getJarak (Titik T){
        return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat,2));
    }

    //jarak darii titik pusat 
    public double getjarakPusat (){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
         this.ordinat = -this.ordinat;
    }

    public void refleksiY(){
         this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis, -this.ordinat);
    }


}
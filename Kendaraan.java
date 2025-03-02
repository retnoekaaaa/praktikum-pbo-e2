//nama: Retno Eka Triatry
//nim: 24060123140188

public class Kendaraan {
    //atribut
    private String noPlat;
    private String Jenis;
    
    public Kendaraan(){

    }

    public Kendaraan (String noPlat, String Jenis){
            this.noPlat = noPlat;
            this.Jenis = Jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getjenis(){
        return this.Jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis( String Jenis){
        if (Jenis.equalsIgnoreCase("motor") || Jenis.equalsIgnoreCase("mobil")){
            this.Jenis = Jenis;
        }
        else{
            System.out.println("Jenis Kendaraan Harus Motor atau Mobil");
        }
    }
}

//nama: Retno Eka Triatry
//nim: 24060123140188

public class MataKuliah {
    //Atirbut 
    private String IDMatkul;
    private String nama_MK;
    private int SKS;

    //Method
    //Konstruktor
    public MataKuliah(){

    }
    public MataKuliah(String IDMatkul, String nama_MK, int SKS){
        this.IDMatkul = IDMatkul;
        this.nama_MK = nama_MK;
        this.SKS = SKS;
    }
    public String getID(){
        return this.IDMatkul;
    }

    public String getNama(){
        return this.nama_MK;
    }
    public int getSKS(){
        return this.SKS;
    }

    public void setID(String IDMatkul){
        this.IDMatkul = IDMatkul;
    }
}

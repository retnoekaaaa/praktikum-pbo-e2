//package Relasi;
//nama: Retno Eka Triatry
//nim: 24060123140188
public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Method
    //Konstruktor
    public Dosen(){

    }
    public Dosen (String nip, String nama, String prodi){
    this.nip = nip;
    this.nama = nama;
    this.prodi = prodi;
    }

    //Selektor (getter)
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public String getNIP(){
        return nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }
}


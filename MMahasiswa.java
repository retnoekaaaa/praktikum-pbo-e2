//nama: Retno Eka Triatry
//nim: 24060123140188

public class MMahasiswa {
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO","Pemograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("PBO", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Rahmat", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}

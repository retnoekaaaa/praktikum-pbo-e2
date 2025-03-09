/* Nama file: ExceptionOnArray.java
 * Deskripsi: 
 * Nama/Nim: Retno Eka Triatry/ 24060123140188
 * Tanggal: 6 Maret 2025 */

public class ExceptionOnArray {
    public static void main(String[] args){
        //instansi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}

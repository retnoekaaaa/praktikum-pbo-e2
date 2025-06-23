import java.util.Map;
import java.util.HashMap;
/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
 *           
 */

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123140188", "Eks");
        mahasiswaMap.put("24060123140134", "Aneen");
        mahasiswaMap.put("24060123130066", "Syahli");
        mahasiswaMap.put("24060123120038", "Naruy");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM: " +key+ "Nama: " +value));
    }
}
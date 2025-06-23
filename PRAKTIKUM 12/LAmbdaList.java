import java.util.ArrayList;

/**
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter 
 *            pada method.
 */
public class LAmbdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Cikky");
        mahasiswaList.add("Nepa");
        mahasiswaList.add("Cal");
        mahasiswaList.add("Ame");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
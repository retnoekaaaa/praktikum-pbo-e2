/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;



public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) throws SQLException {
        List<Mahasiswa> listmhs = new ArrayList<>();

        // Insert
        System.out.println("==== Insert ====");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // Update
        System.out.println("==== Update ====");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // Delete
        System.out.println("==== Delete ====");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

public static void displayAll() {
    System.out.println("===DisplayAll===");
    try {
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Table Kosong");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
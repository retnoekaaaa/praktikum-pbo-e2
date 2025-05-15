/*
 * Nama File   : PersonDAO.java
 * Deskripsi   : Implementasi PersonDAO untuk MySql
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 15 Mei 2025
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo", "root", "Ekagiri050811");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // tutup koneksi database
        con.close();
    }
}

/*
 * Nama File   : MainDAO.java
 * Deskripsi   : Main program untuk akses DAO
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 15 Mei 2025
*/

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        System.out.println("DAO: " + m.getPersonDAO());
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

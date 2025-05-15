/*
 * Nama File   : DAOManagerjava
 * Deskripsi   : pengelola DAO dalam program
 * Pembuat     : Retno Eka Triatry/ 24060123140188
 * Tanggal     : 15 Mei 2025
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}

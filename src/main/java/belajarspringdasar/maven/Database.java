package belajarspringdasar.maven;

/**
 * Design singleton
 * design singleton adalah salah satu design pettern untuk membuat object,
 * dimana sebuah object hanya dibuat satu kali saja
 */
public class Database {

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }


    private Database() {

    }

}


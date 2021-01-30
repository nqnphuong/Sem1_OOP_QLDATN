package Connect_SQL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect_SQL {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270";
            Connection connection = DriverManager.getConnection(dbURL);
            if (connection != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = connection.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
}

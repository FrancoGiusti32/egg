package Store.Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

    protected Connection conection = null;
    protected ResultSet result = null;
    protected Statement statement = null;

    private final String USER = "root";
    private final String PASWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectToDB() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlDataBase = ("jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false");
            conection = DriverManager.getConnection(urlDataBase, USER, PASWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void disconectToDB() throws Exception {
        try {
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conection != null) {
                conection.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void insertModifyDelete(String sql) throws Exception {
        try {
            conectToDB();
            statement = conection.createStatement();
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            disconectToDB();
        }
    }

    protected void consultDB(String sql) throws Exception {
        try {
            conectToDB();
            statement = conection.createStatement();
            result = statement.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        }finally{
            
        }
    }
    
}

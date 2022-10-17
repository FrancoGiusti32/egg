package Store.Conection;

import Store.Entity.manufacturer;
import java.util.ArrayList;

public final class manufacturerDAO extends DAO{
    
    public void saveManufacturer(manufacturer m1) throws Exception {
        try {
            if (m1 == null) {
                throw new Exception("///ERROR: You have to pass a product to add///");
            }
            String sql = "INSERT INTO fabricante (nombre)"
                    + "VALUES ('" + m1.getName() +" ' );";
            insertModifyDelete(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modifyManufacturer(manufacturer m1) throws Exception {
        try {
            if (m1 == null) {
                throw new Exception("///ERROR: You have to pass a manufacter to modify///");
            }
            String sql = "UPDATE fabricante SET "
                    + " nombre =' " + m1.getName() + " '  WHERE codigo = " + m1.getCode() + ";";
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public void deleteManufacturer(Integer id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("///ERROR: You have to pass a product to delete///");
            }
            String sql = "DELETE FROM fabricante " + " WHERE codigo = " +id+ ";";
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<manufacturer> consultList() throws Exception {
        try {
            ArrayList<manufacturer> productList = new ArrayList();
            manufacturer m1 = new manufacturer();
            String sql = "SELECT nombre , codigo FROM fabricante ";
            consultDB(sql);
            while (result.next()) {                
                m1 = new manufacturer();
                m1.setName(result.getString("nombre"));
                m1.setCode(result.getInt("codigo"));
                productList.add(m1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
}

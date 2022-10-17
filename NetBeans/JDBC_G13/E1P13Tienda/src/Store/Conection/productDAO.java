package Store.Conection;

import Store.Entity.product;
import java.util.ArrayList;

public final class productDAO extends DAO {

    public void saveProduct(product p1) throws Exception {
        try {
            if (p1 == null) {
                throw new Exception("///ERROR: You have to pass a product to add///");
            }
            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante)"
                    + "VALUES ('" + p1.getName() + "','" + p1.getPrice() + "','" + p1.getManufacterCode() + "');";
            insertModifyDelete(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modifyProduct(product p1, Integer id) throws Exception {
        try {
            if (p1 == null) {
                throw new Exception("///ERROR: You have to pass a product to modify///");
            }
            String sql = "UPDATE producto SET "
                    + " nombre ='" + p1.getName() + "',precio = " + p1.getPrice() + ", codigo_fabricante = " + p1.getManufacterCode()
                    + " WHERE codigo = " + id + ";";
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public void deleteProduct(Integer id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("///ERROR: You have to pass a product to delete///");
            }
            String sql = "DELETE FROM producto " + " WHERE codigo = " +id+ ";";
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<product> consultListNamePrice() throws Exception {
        try {
            ArrayList<product> productList = new ArrayList();
            product p1 = new product();
            String sql = "SELECT nombre, precio FROM producto ";
            consultDB(sql);
            while (result.next()) {                
                p1 = new product();
                p1.setName(result.getString("nombre"));
                p1.setPrice(result.getDouble("precio"));
                productList.add(p1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
    public ArrayList<product> consultCheapestNamePrice() throws Exception {
        try {
            ArrayList<product> productList = new ArrayList();
            product p1 = new product();
            String sql = "SELECT precio, nombre FROM producto ORDER BY precio ASC LIMIT 1"
                    + "1;";
            consultDB(sql);
            while (result.next()) {                
                p1 = new product();
                p1.setName(result.getString("nombre"));
                p1.setPrice(result.getDouble(1));
                productList.add(p1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
    public ArrayList<product> consultListName() throws Exception {
        try {
            ArrayList<product> productList = new ArrayList();
            product p1 = new product();
            String sql = "SELECT nombre FROM producto ";
            consultDB(sql);
            while (result.next()) {                
                p1 = new product();
                p1.setName(result.getString("nombre"));
                        
                productList.add(p1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
    public ArrayList<product> consultListWherePrice(int max, int min) throws Exception {
        try {
            ArrayList<product> productList = new ArrayList();
            product p1 = new product();
            String sql = "SELECT * FROM producto WHERE precio < "+max+" and precio > "+min;
            consultDB(sql);
            while (result.next()) {                
                p1 = new product();
                p1.setName(result.getString("nombre"));
                p1.setCode(result.getInt("codigo"));
                p1.setManufacterCode(result.getInt("codigo_fabricante"));
                p1.setPrice(result.getDouble("precio"));
                productList.add(p1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
    public ArrayList<product> consultListWhereLikeName(String name) throws Exception {
        try {
            ArrayList<product> productList = new ArrayList();
            product p1 = new product();
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%"+name+"%' ;";
            consultDB(sql);
            while (result.next()) {                
                p1 = new product();
                p1.setName(result.getString("nombre"));
                p1.setCode(result.getInt("codigo"));
                p1.setManufacterCode(result.getInt("codigo_fabricante"));
                p1.setPrice(result.getDouble("precio"));
                productList.add(p1);
            }
            disconectToDB();
        return productList;
        } catch (Exception e) {
            disconectToDB();
            throw e;
        }
    }
}

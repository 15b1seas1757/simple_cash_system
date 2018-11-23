package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class customerDAO {
 
    public customerDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	//*******************************
    //SELECT an Employee
    //*******************************
    public static Product searchProduct (int skucode) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM procuct WHERE skucode="+skucode;
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsCustomer = DBUtil.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            Product CustomerClass = getProductFromResultSet(rsCustomer);
 
            //Return employee object
            return CustomerClass;
        } catch (SQLException e) {
            System.out.println("While searching an customer with " + skucode + " accNo, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }
 
    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static Product getProductFromResultSet(ResultSet rs) throws SQLException
    {
    	Product Product = null;
    	if (rs.next()) {
    		Product = new Product();
    		Product.setSkucode(rs.getInt("skucode"));
    		Product.setSkuname(rs.getString("skuname"));
    		Product.setSkutype(rs.getString("skutype"));
    		Product.setSkuprice(rs.getFloat("skuprice"));
    		Product.setSkuqua(rs.getInt("skuqua"));
    		
        }
        return Product;
    }
 
    //*******************************
    //SELECT Employees
    //*******************************
    public static ObservableList<Product> searchProduct1 () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM product";
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsProduct = DBUtil.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<Product> prodcutList = getProductList1(rsProduct);
 
            //Return employee object
            return prodcutList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }
 
  

	private static ObservableList<Product> getProductList1(ResultSet rsProduct) throws SQLException, ClassNotFoundException {
    	//Declare a observable List which comprises of Employee objects
        ObservableList<Product> ProductList = FXCollections.observableArrayList();
 
        while (rsProduct.next()) {
        	Product Product = new Product();
        	Product = new Product();
        	Product.setSkucode(rsProduct.getInt("skucode"));
    		Product.setSkuname(rsProduct.getString("skuname"));
    		Product.setSkutype(rsProduct.getString("skutype"));
    		Product.setSkuprice(rsProduct.getFloat("skuprice"));
    		Product.setSkuqua(rsProduct.getInt("skuqua"));
            //Add employee to the ObservableList
            ProductList.add(Product);
        }
        //return empList (ObservableList of Employees)
        return ProductList;
	}

	
    //*************************************
    //UPDATE an employee's email address
    //*************************************
   /* public static void updateBooksEmail (String empId, String empEmail) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        String updateStmt =
                "BEGIN\n" +
                        "   UPDATE emp\n" +
                        "      SET EMAIL = '" + empEmail + "'\n" +
                        "    WHERE EMPLOYEE_ID = " + empId + ";\n" +
                        "   COMMIT;\n" +
                        "END;";
 
        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }*/
 
    //*************************************
    //DELETE an employee
    //*************************************
    public static void deleteBookWithId (String id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM books\n" +
                        "         WHERE id ="+ id +";\n" +
                        "   COMMIT;\n" +
                        "END;";
 
        //Execute DELETE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
 
    //*************************************
    //INSERT an employee
    //*************************************
    public static void insertBook (String Title, String author, float price, int qty) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                        "INSERT INTO books\n" +
                        "(title, author, price, qty)\n" +
                        "VALUES\n" +
                        "('"+Title+"', '"+author+"','"+price+"', '"+qty+"');";
 
        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while INSERT Operation: " + e);
            throw e;
        }
    }
}
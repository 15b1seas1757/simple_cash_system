package application;


import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {
	DBUtil util=null;
	
	TestDB() throws ClassNotFoundException{
		util=new DBUtil();
		try {
			DBUtil.dbConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Declare a SELECT statement
		String selectStmt = "SELECT * FROM customer";

		//Execute SELECT statement
		try {
			//Get ResultSet from dbExecuteQuery method
			ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);
			print(rs);
			
		} catch (SQLException e) {
			// System.out.println("While searching an employee with " + empId + " id, an error occurred: " + e);
		}
	}
	
	void print(ResultSet rs){
		try {
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			new TestDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

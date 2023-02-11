package labtest;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SimpleQuery {
	static String connectionUrl = "jdbc:mysql://localhost/classicmodels";
    static String userName = "root";
    static String userPass = "Perscholas1";
    static Connection con=null;

    // Main driver method
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 try {
             con = DriverManager.getConnection(connectionUrl, userName,
                    userPass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Step 3: Creating statement
        Statement st = con.createStatement();

        // Step 4: Executing the query and storing the
        // result
        ResultSet rs = st.executeQuery(
            "select employeeNumber, lastName, firstName, VacationHours from employees where VacationHours > 20");

        // Step 5: Processing the results
        while (rs.next()) {
            System.out.println("Begin New Record");
            System.out.println("employeeNumber:" + rs.getInt(1));
            System.out.println("lastName:" + rs.getString(2));
            System.out.println("firstName:" + rs.getString(3));
            System.out.println("VacationHours:" + rs.getInt(4));
           // FILL IN CODE HERE
        }

        // Step 6: Closing the connections
        // using close() method to release memory resources
        con.close();
    
    // Display message for successful execution of program
    System.out.println("JDBC query completed");
	}

}

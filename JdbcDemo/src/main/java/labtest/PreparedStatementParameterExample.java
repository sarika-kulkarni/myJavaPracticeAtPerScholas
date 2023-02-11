package labtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementParameterExample {
	static Connection connection = null;
    String driverName = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost/classicmodels";
    String userName = "root";
    String userPass = "Perscholas1";

    public PreparedStatementParameterExample() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(connectionUrl, userName,
                    userPass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 PreparedStatementParameterExample ptmtExample = new PreparedStatementParameterExample();
	        Connection con = ptmtExample.getConnection();
	        ResultSet resultSet = null;
	        // Writing a parameterised query in prepared Statement
	        String insertQuery = "INSERT INTO student(RollNo,Name,Course,Address) VALUES(?,?,?,?)";
	        try {
	            // Compiling query String
	            PreparedStatement statement = con.prepareStatement(insertQuery);
	            // setting parameter to the query
	            statement.setInt(1, 501);
	            statement.setString(2, "Leslie Jennings");
	            statement.setString(3, "Computer Science");
	            statement.setString(4, "98 Park road");
	            statement.executeUpdate();
	            
	            statement.setInt(1, 502);
	            statement.setString(2, "John");
	            statement.setString(3, "Fox");
	            statement.setString(4, "88 Park road");
	            statement.executeUpdate();            
	            
	            
	            //Updating a Query
	            String updateQuery = "update student set Address=? where RollNo = ?";
	            PreparedStatement statement1 = con.prepareStatement(updateQuery);
	            statement1.setString(1, "Morris Plains");
	            statement1.setInt(2, 501);  
	            int rowsAffected = statement1.executeUpdate();
	            System.out.println("Number of rows updated: " + rowsAffected);
	            
	          //deleting a Query
	            String deleteQuery = "delete from student where RollNo = ?";
	            PreparedStatement statement2 = con.prepareStatement(deleteQuery);
	            statement2.setInt(1, 502);
	            int rowsAffected1 = statement2.executeUpdate();
	            System.out.println("Number of rows deleted: " + rowsAffected1);
	                       
	            Statement st = con.createStatement();            
	            ResultSet rs = st.executeQuery("select * from student");
	            while (rs.next()) {
	                System.out.println(rs.getString("RollNo"));
	                System.out.println(rs.getString("Name"));
	                System.out.println(rs.getString("Course"));
	                System.out.println(rs.getString("Address"));
	            }
	            statement.close();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            con.close();
	        }
	    }
	}



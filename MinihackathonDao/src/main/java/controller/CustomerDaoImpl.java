package controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DaoInterface.CustomerDAO;
import DaoInterface.ConnectionDAO;
import model.Customer;

public class CustomerDaoImpl extends ConnectionDAO implements CustomerDAO{
	public void saveCustomer(List<Customer> CustomerList) {
	       try {
	          Connection con = ConnectionDAO.getConnection();
	          for(Customer c: CustomerList) {
	              String sqlQuery = "INSERT INTO customer (email,fname,lname) VALUES (?,?,?)";
	              PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
	              prepStmt.setString(1,  c.getEmail());
	              prepStmt.setString(2, c.getFname());
	              prepStmt.setString(3, c.getLname());
	              int affectedRows = prepStmt.executeUpdate();
	              System.out.println(affectedRows + " row(s) affected !!");
	          }
	       }
	       catch (ClassNotFoundException e)
	       {
	       } catch (SQLException throwables) {
	           throwables.printStackTrace();
	       }
	   }

	   public List<Customer> getAllCustomer() {
	       try {
	           Connection connection = ConnectionDAO.getConnection();
	           Statement stmt = connection.createStatement();
	           ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
	           List customerlist = new ArrayList();
	           while(rs.next())
	           {
	               Customer c = new Customer();
	               c.setId(rs.getInt("id"));
	               c.setEmail( rs.getString("email") );
	               c.setFname( rs.getString("fname") );
	               c.setLname( rs.getString("lname") );
	               customerlist.add(c);
	           }
	           return customerlist;

	       } catch (SQLException ex) {
	           ex.printStackTrace();
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	       return null;
	   }

	   public boolean updateCustomer(Customer customer, int id){
	        try {
	            Connection connection = ConnectionDAO.getConnection();
	            PreparedStatement ps = connection.prepareStatement("UPDATE customer SET email=?, fname=?, lname=? WHERE id=?");
	            ps.setString(1, customer.getEmail());
	            ps.setString(2, customer.getFname());
	            ps.setString(3, customer.getLname());
	            ps.setInt(4, id);
	           int i = ps.executeUpdate();
	           if(i == 1) {
	               return true;
	           }
	       }
	       catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException e) {
	           e.printStackTrace();
	           System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	       }
	       return false;
	   }

	   public boolean deleteCustomer(int id) {
	       try {
	           Connection connection = ConnectionDAO.getConnection();
	           PreparedStatement ps = connection.prepareStatement("DELETE FROM customer WHERE id=?");
	           ps.setInt(1, id);
	           int i = ps.executeUpdate();
	           if(i == 1) {
	               return true;
	           }
	       } catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException ex) {
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       }
	       return false;
	   }


}

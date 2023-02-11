package Runner;
import controller.CustomerDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DaoInterface.CustomerDAO;
import model.Customer;

public class AccessCustomer {
	public static void main(String[] args) {

	// creating object
     CustomerDAO customerDao = new CustomerDaoImpl();
     System.out.println("--------- inserting customer records ----------");
     
  
    ArrayList<Customer> CustomerList = new ArrayList<Customer>();

    Customer c1 = new Customer();
    c1.setEmail("abc@gmail.com");
    c1.setFname("Sarika");
    c1.setLname("Kulkarni");
    
    CustomerList.add(c1);

    Customer c2 = new Customer();
    c2.setEmail("def@gmail.com");
    c2.setFname("Sam");
    c2.setLname("Johnson");
    CustomerList.add(c2);

    Customer c3 = new Customer();
    c3.setEmail("hij@gmail.com");
    c3.setFname("Riya");
    c3.setLname("Roy");
    CustomerList.add(c3);

    Customer c4 = new Customer();
    c4.setEmail("klm@gmail.com");
    c4.setFname("John");
    c4.setLname("Taylor");
    CustomerList.add(c4);
    customerDao.saveCustomer(CustomerList);
    
    
    List<Customer> customers = null;
    System.out.println( " ====== Display list of all customers ====");
    try {
    	customers =  customerDao.getAllCustomer();
       for (Customer cc : customers) {
         String email = cc.getEmail();
           String fname = cc.getFname();
           String lname = cc.getLname();
           
           System.out.println("======================");
           System.out.println("Email id :" + email + " First name: " + fname + " and Last name: " + lname);

       }
    } catch (ClassNotFoundException e) {
       e.printStackTrace();
    } catch (SQLException e) {
       e.printStackTrace();
    }
    
    System.out.println("Updating customer information for customer id:" + customers.get(0).getId());
    System.out.println("----Customer information is updating -----");
    Customer customerupdating = customers.get(0);
    customerupdating.setEmail("lmn@gmail.com");
    customerupdating.setFname("Myra");
    customerupdating.setLname("Sen");
    
    boolean result = customerDao.updateCustomer(customerupdating, customerupdating.getId());
    System.out.println(result);

    System.out.println("Deleting customer with customer id:" + customers.get(1).getId());
    boolean a = customerDao.deleteCustomer(customers.get(1).getId()); // 
    if(a == true) {
           System.out.println("Record is deleted");
    }
    else
    {
           System.out.println("Record is not deleted");
    }
}
}




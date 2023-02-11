package DaoInterface;

import java.sql.SQLException;
import java.util.List;
import model.Customer;

public interface CustomerDAO {
	
	/*getCustomerById(int id) - Returns the customer object for the given id.
	addCustomer(Customer c) - Adds a customer with given information.
	removeCustomerById(int id) - Removes a customer with the given id.*/
	
	/** This is the method to be used to list down all the records from the Customer table.*/
	   List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException;

	/** This method to be used to create a record in the Customer table. */
	   void saveCustomer(List<Customer> CustomerList);

	/** This is the method to be used to delete a record from the Customer table corresponding to a passed Customer id. */
	   boolean deleteCustomer(int id);

	/** This is the method to be used to update a record into the customer table. */
	   boolean updateCustomer(Customer customer, int id);

}

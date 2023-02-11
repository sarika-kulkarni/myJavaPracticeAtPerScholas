package DaoInterface;
import java.sql.SQLException;
import java.util.List;

import model.Customer;
import model.Item;
public interface ItemDAO {
	/* getAllItems() - Returns a list of all item objects in the database.
addItem(Item i) - Adds an item with given information.
removeItemById(int id) - Removes an item with the given id. */
	/** This is the method to be used to list down all the records from the Customer table.*/
	   List<Item> getAllItem() throws ClassNotFoundException, SQLException;

	/** This method to be used to create a record in the Customer table. */
	   void saveItem(List<Item> ItemList);

	/** This is the method to be used to delete a record from the Customer table corresponding to a passed Customer id. */
	   boolean deleteItem(int id);

	/** This is the method to be used to update a record into the books table. */
	   boolean updateItem(Item item, int id);

}

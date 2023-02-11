package Runner;
import controller.ItemDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DaoInterface.ItemDAO;
import model.Customer;
import model.Item;

public class AccessItem {
	public static void main(String[] args) {

	// creating object
		ItemDAO itemDao = new ItemDaoImpl();
    System.out.println("--------- inserting item records ----------");
  
    ArrayList<Item> ItemList = new ArrayList<Item>();

    Item i1 = new Item();
    i1.setItemName("Burger");
    i1.setPrice(8.5);
    ItemList.add(i1);

    Item i2 = new Item();
    i2.setItemName("Pizza");
    i2.setPrice(10.0);
    ItemList.add(i2);
    
    Item i3 = new Item();
    i3.setItemName("Fries");
    i3.setPrice(5.0);
    ItemList.add(i3);

    Item i4 = new Item();
    i4.setItemName("Onion rings");
    i4.setPrice(7.25);
    ItemList.add(i4);

    itemDao.saveItem(ItemList);
    
    List<Item> items = null;
    System.out.println( " ====== Display list of all items ====");
    try {
    	items = itemDao.getAllItem();
       for (Item ii : items) {
         String itemName = ii.getItemName();
           double price = ii.getPrice();
           
           
           System.out.println("======================");
           System.out.println("Item name:" + itemName + " and Price: " + price);

       }
    } catch (ClassNotFoundException e) {
       e.printStackTrace();
    } catch (SQLException e) {
       e.printStackTrace();
    }
        
    System.out.println("----Item information is updating for item id:" + items.get(0).getId());
    Item Itemupdating = items.get(0);
    Itemupdating.setItemName("Burrito");
    Itemupdating.setPrice(12.50);
    boolean result = itemDao.updateItem(Itemupdating, items.get(0).getId());
    System.out.println(result);

    System.out.println("Deleting item with item id:" + items.get(1).getId());
    boolean a = itemDao.deleteItem(items.get(1).getId());
    if(a == true) {
           System.out.println("Record is deleted");
    }
    else
    {
           System.out.println("Record is not deleted");
    }


}
}



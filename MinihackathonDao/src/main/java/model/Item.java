package model;

public class Item {
	 private int id;
	private String itemName;
	private double price;
	// ----Constructor---
	   public Item() {
	   }

	   public Item(String itemName, double price) {
	       this.itemName = itemName;
	       this.price = price;
	   }
	 public Item(int id, String itemName, double price) {
	     this.itemName = itemName;
	     this.price = price;
	     this.id = id;
	  }
	 // getter setter methods

	  public int getId() {
	     return id;
	  }

	  public void setId(int id) {
	     this.id = id;
	  }
	  
	  public String getItemName() {
	     return itemName;
	  }

	  public void setItemName(String itemName) {
	     this.itemName = itemName;
	  }

	  public double getPrice() {
	     return price;
	  }

	  public void setPrice(double price) {
	     this.price = price;
	  }
}

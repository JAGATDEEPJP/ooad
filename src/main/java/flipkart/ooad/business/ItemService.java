package flipkart.ooad.business;

import java.util.List;

import flipkart.ooad.database.ItemDatabase;
import flipkart.ooad.models.ItemInfo;

public class ItemService 
{
	ItemDatabase id = new ItemDatabase();

	public List<ItemInfo> getItems()
	{
		return id.getItems();
		//call to getImage of itemDatabase.java
	}
}

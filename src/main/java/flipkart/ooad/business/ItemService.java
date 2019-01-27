package flipkart.ooad.business;

import java.util.List;

import flipkart.ooad.database.ItemDatabase;
import flipkart.ooad.models.ItemInfo;

public class ItemService 
{
	public List<ItemInfo> getImage()
	{
		ItemDatabase id = new ItemDatabase();
		return id.getImage();
		//call to getImage of itemDatabase.java
	}
}

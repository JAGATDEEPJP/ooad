package flipkart.ooad.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import flipkart.ooad.business.ItemService;
import flipkart.ooad.models.ItemInfo;

public class ItemResource {

	@GET
	@Path("itemImages")
	public List<ItemInfo> getImage()
	{
		ArrayList<ItemInfo> a= new ArrayList<ItemInfo>();
		ItemService is = new ItemService();
		return is.getImage();
	}
}

package flipkart.ooad.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import flipkart.ooad.business.ItemService;
import flipkart.ooad.models.ItemInfo;
@Path("item")
public class ItemResource {

	@GET
	@Path("itemImages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemInfo> getImage()
	{
		ArrayList<ItemInfo> a= new ArrayList<ItemInfo>();
		ItemService is = new ItemService();
		return is.getImage();
	}
}

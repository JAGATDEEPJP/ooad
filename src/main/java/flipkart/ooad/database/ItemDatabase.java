package flipkart.ooad.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import flipkart.ooad.models.ItemInfo;

public class ItemDatabase {
	private Connection connection;
	public ItemDatabase(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(
					DatabaseConfiguration.dataBaseUrl,
					DatabaseConfiguration.userName,
					DatabaseConfiguration.password);
		}catch(Exception e) {
			System.out.println("Exception while establishing connection");
			System.out.println(e);
		}
	}
	
	public List<ItemInfo> getItems()
	{
		System.out.println("hr");
		ArrayList<ItemInfo> images=new ArrayList<ItemInfo>();
		try {
			PreparedStatement stmt=connection.prepareStatement("SELECT ITEMINFO.ITEM_ID, ITEMINFO.NAME, ITEMINFO.DESCRIPTION, "
					+ "ITEMINFO.IMG_URL, ITEMINFO.CAT_ID, ITEMINFO.SUBCAT_ID, ITEM.SELLER_ID, ITEM.PRICE FROM ITEMINFO INNER JOIN "
					+ "ITEM ON ITEMINFO.ITEM_ID = ITEM.ITEM_ID;");
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				ItemInfo item=new ItemInfo();
				item.setItem_id(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setDesc(rs.getString(3));
				item.setImg_url(rs.getString(4));
				item.setCat_id(rs.getInt(5));
				item.setSubcat_id(rs.getInt(6));
				item.setSeller_id(rs.getInt(7));
				item.setPrice(rs.getInt(8));
				images.add(item);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return images;
	}

}

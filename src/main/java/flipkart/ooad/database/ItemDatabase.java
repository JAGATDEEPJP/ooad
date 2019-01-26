package flipkart.ooad.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	private ArrayList<ItemInfo> getImage()
	{
		ArrayList<ItemInfo> images=new ArrayList<ItemInfo>();
		try {
			PreparedStatement stmt=connection.prepareStatement("select * from student;");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				ItemInfo item=new ItemInfo();
				item.setItem_id(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setDesc(rs.getString(3));
				item.setImg_url(rs.getString(4));
				item.setCat_id(rs.getInt(5));
				item.setSubcat_id(rs.getInt(6));
			//	item.setPrice(7);
			//	item.setSeller_id(8);				
				images.add(item);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
//		Collections.sort(students, new StudentGradeComparator());
		return images;
	}

}

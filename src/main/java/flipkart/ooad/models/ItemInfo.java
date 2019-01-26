package flipkart.ooad.models;

public class ItemInfo {

	private int item_id;
	private int cat_id;
	private int subcat_id;
	private int seller_id;
	private int price;
	private String desc;
	private String name;
	private String img_url;
	public ItemInfo()
	{
		
	}

	public ItemInfo(int item_id, int cat_id, int subcat_id, int seller_id, int price, String desc, String name,
			String img_url) {
		super();
		this.item_id = item_id;
		this.cat_id = cat_id;
		this.subcat_id = subcat_id;
		this.seller_id = seller_id;
		this.price = price;
		this.desc = desc;
		this.name = name;
		this.img_url = img_url;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(int subcat_id) {
		this.subcat_id = subcat_id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	
}

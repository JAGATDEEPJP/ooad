package flipkart.ooad.business;

import flipkart.ooad.database.Database;
import flipkart.ooad.models.BuyerInfoModel;
import flipkart.ooad.models.LoginModel;

public class BuyerService {
	private Database database;
	public BuyerService() {
		database=new Database();
	}
	public BuyerInfoModel validateLogin(LoginModel loginObj) {
		if(database.validateLogin(loginObj)==true) {
			return database.getBuyerInfo(loginObj);
		}else {
			return new BuyerInfoModel();
		}
	}
}

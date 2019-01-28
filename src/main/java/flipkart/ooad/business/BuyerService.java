package flipkart.ooad.business;

import flipkart.ooad.database.BuyerDatabase;
import flipkart.ooad.models.BuyerInfoModel;
import flipkart.ooad.models.LoginModel;
import flipkart.ooad.models.SignUpModel;

public class BuyerService {
	private BuyerDatabase buyerDatabase;
	public BuyerService() {
		buyerDatabase=new BuyerDatabase();
	}
	public BuyerInfoModel validateLogin(LoginModel loginObj) {
		if(buyerDatabase.validateLogin(loginObj)==true) {
			return buyerDatabase.getBuyerInfo(loginObj);
		}else {
			return null;
		}
	}
	public boolean signUp(SignUpModel signUpObj) {
			if(buyerDatabase.signUp(signUpObj)==1) {
				return true;
			}
		return false;
	}
	public boolean validate(String number) {
		//System.out.println(signUpObj);
		return buyerDatabase.validateUsername(number); 
	}
}

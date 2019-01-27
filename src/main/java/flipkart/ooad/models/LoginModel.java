package flipkart.ooad.models;

public class LoginModel {
	private String mobileNum;
	private String password;
	public LoginModel()
	{
		
	}
	
	public LoginModel(String mobileNum, String password) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
	}

	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return this.mobileNum+" "+this.password;
	}
}

package flipkart.ooad.models;

import java.time.LocalDate;

public class SignUpModel {
	private String mobileNum;
	private String password;
	private LocalDate localDate;
	public SignUpModel()
	{
		
	}
	
	@Override
	public String toString() {
		return "LoginModel [mobileNum=" + mobileNum + ", password=" + password + "]";
	}

	public SignUpModel(String mobileNum, String password,LocalDate localDate) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
		this.localDate=localDate;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
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
}

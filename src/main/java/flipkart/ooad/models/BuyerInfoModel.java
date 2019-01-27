package flipkart.ooad.models;

import java.time.LocalDate;

public class BuyerInfoModel {
	private String email;
	private String mobileNum;
	private String name;
	private String password;
	private LocalDate date;
	public BuyerInfoModel()
	{
		
	}
	
	@Override
	public String toString() {
		return "BuyerInfoModel [email=" + email + ", mobileNum=" + mobileNum + ", name=" + name + ", password="
				+ password + ", date=" + date + "]";
	}

	public BuyerInfoModel(String email, String mobileNum, String name, String password, LocalDate date) {
		super();
		this.email = email;
		this.mobileNum = mobileNum;
		this.name = name;
		this.password = password;
		this.date = date;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}

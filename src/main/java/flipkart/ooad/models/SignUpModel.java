package flipkart.ooad.models;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlRootElement
public class SignUpModel {
	private String mobileNum;
	private String password;
	private LocalDate DOB;
	public SignUpModel()
	{
		
	}
	
	@Override
	public String toString() {
		return "LoginModel [mobileNum=" + mobileNum + ", password=" + password +"Date"+DOB+ "]";
	}

	public SignUpModel(String mobileNum, String password,LocalDate localDate) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
		this.DOB=localDate;
	}
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public LocalDate getDOB() {
		return DOB;
	}
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public void setDOB(LocalDate localDate) {
		this.DOB = localDate;
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

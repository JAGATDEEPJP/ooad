package flipkart.ooad.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import flipkart.ooad.models.BuyerInfoModel;
import flipkart.ooad.models.LoginModel;

public class BuyerDatabase {
	private Connection connection;
	public BuyerDatabase(){
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
	public Boolean validateLogin(LoginModel loginObj) {
		try {
			String mobileNum=loginObj.getMobileNum();
			PreparedStatement stmt=connection.prepareStatement("SELECT PASSWORD FROM BUYERINFO WHERE "
					+ "MOBILE_NUM=?;");
			stmt.setString(1, mobileNum);
			ResultSet resSet=stmt.executeQuery();
			while(resSet.next()) {
				String pwd=resSet.getString(1);
				if(pwd.equals(loginObj.getPassword())==true) {
					return true;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	public BuyerInfoModel getBuyerInfo(LoginModel loginObj) {
		BuyerInfoModel buyer=new BuyerInfoModel();
		try {
			String mobileNum=loginObj.getMobileNum();
			PreparedStatement stmt=connection.prepareStatement("SELECT * FROM BUYERINFO WHERE "
					+ "MOBILE_NUM=?;");
			stmt.setString(1, mobileNum);
			ResultSet resSet=stmt.executeQuery();
			while(resSet.next()) {
				buyer.setMobile_num(resSet.getString(2));
				buyer.setEmail(resSet.getString(3));
				buyer.setName(resSet.getString(4));
				buyer.setPassword(resSet.getString(5));
				java.sql.Date date=resSet.getDate(6);
				LocalDate ldate=date.toLocalDate();
				buyer.setDate(ldate);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return buyer;
	}
}

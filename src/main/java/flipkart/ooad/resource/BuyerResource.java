package flipkart.ooad.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import flipkart.ooad.business.BuyerService;
import flipkart.ooad.models.BuyerInfoModel;
import flipkart.ooad.models.LoginModel;
import flipkart.ooad.models.SignUpModel;

@Path("buyer")
public class BuyerResource {
	private BuyerService buyerService=new BuyerService();
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BuyerInfoModel login(LoginModel loginObj) {
		return buyerService.validateLogin(loginObj);
	}
	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean signUp(SignUpModel signUpObj) {
		//System.out.println(signUpObj);
		return buyerService.signUp(signUpObj); 
	}
}

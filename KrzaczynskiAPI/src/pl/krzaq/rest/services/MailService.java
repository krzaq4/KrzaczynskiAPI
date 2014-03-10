package pl.krzaq.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;


@Provider
@Path("/mail")
public class MailService {

	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sendMail() {
		StringBuffer result = new StringBuffer() ;
		result.append("Hello");
		
		
		
		return result.toString();
	}
	
	
}

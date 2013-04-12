package com.mkyong.rest;

import id.or.linux.jak.Bo.CustomerBo;
import id.or.linux.jak.DAO.CustomerDaoImpl;
import id.or.linux.jak.domain.Customer;
import id.or.linux.spring.SpringApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulExample/rest/message/hello%20world
@Path("/message")
public class MessageRestService {

	
	
	
	@GET
	@Path("/"+"name="+"{pName}"+","+"address="+"{pAddress}"+","+"type="+"{pType}")
	public Response printMessage
			(@PathParam("pName") String msg1,
			@PathParam("pAddress")String msg2,
			@PathParam("pType")String msg3) {

		CustomerBo customerBo = (CustomerBo) SpringApplicationContext.getBean("customerBo1");
		
		Customer cm = new Customer();
	
//	System.out.println("name class of CustomerBo = "+customerBo.getClass().getCanonicalName());
	cm.setName(msg1);
	cm.setAddress(msg2);
	cm.setType(msg3);
	
	customerBo.AddCustomer(cm);
		
		String result = "name = "+msg1+" address = "+msg2+" type = "+msg3;
		
		return Response.status(200).entity(result).build();

	}



}
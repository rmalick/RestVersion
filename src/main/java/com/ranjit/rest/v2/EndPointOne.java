package com.ranjit.rest.v2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/api/v2")
public class EndPointOne {
	@GET
	@Path("ep1/resource1/{param}")
	public Response resource1(@PathParam("param") String msg) {

		String result = "Inside EndPointOne.resource1 of v2 : " + msg;
		// call service method here
		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("ep1/resource2/{param}")
	public Response resource2(@PathParam("param") String msg) {

		String result = "Inside EndPointOne.resource2 of v2 : " + msg;
		// call service method here
		return Response.status(200).entity(result).build();
	}
}

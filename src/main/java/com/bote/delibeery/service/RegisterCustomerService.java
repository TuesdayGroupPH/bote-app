package com.bote.delibeery.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import com.bote.delibeery.bus.CustomerBus;
import com.bote.delibeery.bus.impl.CustomerBusImpl;
import com.bote.delibeery.dto.CustomerDTO;
import com.bote.delibeery.dto.RegisterCustomerDTO;
import com.bote.delibeery.exception.RequiredFieldException;

@Path("/registerCustomer")
public class RegisterCustomerService {

	@GET
	@Produces("application/json")
	public Response registerCustomer(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			CustomerDTO customerDTO = new RegisterCustomerDTO(uriInfo.getQueryParameters());

			CustomerBus bus = new CustomerBusImpl();
			customerDTO = bus.createCustomer(customerDTO);

			// set a dummy id for now
			// customerDTO.setId(ThreadLocalRandom.current().nextLong(1, 1001));

			// convert DTO to JSON object
			JSONObject customerJsonObject = new JSONObject(customerDTO);
			jsonObject.put("customer", customerJsonObject);

		} catch (RequiredFieldException rfe) {
			jsonObject.put("error", rfe.getMessage());
		} catch (Exception e) {
			jsonObject.put("error", e.getMessage());
		}

		return Response.status(200).entity(jsonObject.toString()).build();
	}
}

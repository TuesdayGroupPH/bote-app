package com.bote.tuesdaygroup.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import com.bote.tuesdaygroup.dto.CustomerDTO;
import com.bote.tuesdaygroup.dto.UpdateCustomerDTO;
import com.bote.tuesdaygroup.exception.RequiredFieldException;

@Path("/updateCustomer")
public class UpdateCustomerService {

	@GET
	@Produces("application/json")
	public Response updateCustomer(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			CustomerDTO customerDTO = new UpdateCustomerDTO(
					uriInfo.getQueryParameters());

			// TODO: update the customer

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

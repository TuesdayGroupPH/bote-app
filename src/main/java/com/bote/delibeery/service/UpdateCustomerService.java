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
import com.bote.delibeery.dto.UpdateCustomerDTO;
import com.bote.delibeery.exception.RecordNotFoundException;
import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the service class that handles the update of a customer record.
 *
 * @author MarkS
 *
 */
@Path("/updateCustomer")
public class UpdateCustomerService {

	@GET
	@Produces("application/json")
	public Response updateCustomer(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			CustomerDTO customerDTO = new UpdateCustomerDTO(uriInfo.getQueryParameters());

			CustomerBus bus = new CustomerBusImpl();
			bus.updateCustomer(customerDTO);

			// convert DTO to JSON object
			JSONObject customerJsonObject = new JSONObject(customerDTO);
			jsonObject.put("customer", customerJsonObject);

		} catch (RequiredFieldException rfe) {
			jsonObject.put("error", rfe.getMessage());
		} catch (RecordNotFoundException rnfe) {
			jsonObject.put("error", rnfe.getMessage());
		} catch (Exception e) {
			jsonObject.put("error", e.getMessage());
		}

		return Response.status(200).entity(jsonObject.toString()).build();
	}
}

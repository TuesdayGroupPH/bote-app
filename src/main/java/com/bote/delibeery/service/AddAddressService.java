package com.bote.delibeery.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import com.bote.delibeery.bus.AddressBus;
import com.bote.delibeery.bus.impl.AddressBusImpl;
import com.bote.delibeery.dto.AddAddressDTO;
import com.bote.delibeery.dto.AddressDTO;
import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the service class for adding an address record.
 *
 * @author MarkS
 *
 */
@Path("/addAddress")
public class AddAddressService {

	@GET
	@Produces("application/json")
	public Response registerCustomer(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			AddressDTO addressDTO = new AddAddressDTO(uriInfo.getQueryParameters());

			AddressBus bus = new AddressBusImpl();
			addressDTO = bus.addAddress(addressDTO);

			// convert DTO to JSON object
			JSONObject customerJsonObject = new JSONObject(addressDTO);
			jsonObject.put("customer", customerJsonObject);

		} catch (RequiredFieldException rfe) {
			jsonObject.put("error", rfe.getMessage());
		} catch (Exception e) {
			jsonObject.put("error", e.getMessage());
		}

		return Response.status(200).entity(jsonObject.toString()).build();
	}

}

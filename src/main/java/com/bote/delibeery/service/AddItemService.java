package com.bote.delibeery.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import com.bote.delibeery.bus.ItemBus;
import com.bote.delibeery.bus.impl.ItemBusImpl;
import com.bote.delibeery.dto.AddItemDTO;
import com.bote.delibeery.dto.ItemDTO;
import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the service class for adding an Item record.
 *
 * @author MarkS
 *
 */
@Path("/addItem")
public class AddItemService {

	@GET
	@Produces("application/json")
	public Response addItem(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			ItemDTO itemDTO = new AddItemDTO(uriInfo.getQueryParameters());

			ItemBus bus = new ItemBusImpl();
			itemDTO = bus.addItem(itemDTO);

			// convert DTO to JSON object
			JSONObject itemJsonObject = new JSONObject(itemDTO);
			jsonObject.put("item", itemJsonObject);

		} catch (RequiredFieldException rfe) {
			jsonObject.put("error", rfe.getMessage());
		} catch (Exception e) {
			jsonObject.put("error", e.getMessage());
		}

		return Response.status(200).entity(jsonObject.toString()).build();
	}

}

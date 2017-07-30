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
import com.bote.delibeery.dto.ItemDTO;
import com.bote.delibeery.dto.UpdateItemDTO;
import com.bote.delibeery.exception.RecordNotFoundException;
import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the service class for updating an item record.
 *
 * @author MarkS
 *
 */
@Path("/updateItem")
public class UpdateItemService {

	@GET
	@Produces("application/json")
	public Response updateItem(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			ItemDTO itemDTO = new UpdateItemDTO(uriInfo.getQueryParameters());

			ItemBus bus = new ItemBusImpl();
			itemDTO = bus.updateItem(itemDTO);

			// convert DTO to JSON object
			JSONObject itemJsonObject = new JSONObject(itemDTO);
			jsonObject.put("item", itemJsonObject);

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

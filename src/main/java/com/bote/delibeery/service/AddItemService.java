package com.bote.delibeery.service;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import com.bote.delibeery.dto.AddItemDTO;
import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the service class for adding an Item record.
 *
 * @author MarkS
 *
 */
@Path("/addItem")
public class AddItemService {

	public Response addItem(@Context UriInfo uriInfo) {

		JSONObject jsonObject = new JSONObject();

		try {
			AddItemDTO itemDTO = new AddItemDTO(uriInfo.getQueryParameters());

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

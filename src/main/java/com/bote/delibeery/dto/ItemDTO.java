package com.bote.delibeery.dto;

import java.math.BigDecimal;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

/**
 * DTO class for Item information.
 *
 * @author MarkS
 *
 */
public class ItemDTO extends BaseDTO {

	public ItemDTO() {
	}

	public ItemDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		setId(StringUtil.isNullOrBlank(queryParams.getFirst("id")) ? 0L : Long.parseLong(queryParams.getFirst("id")));
		setCode(queryParams.getFirst("code"));
		setDescription(queryParams.getFirst("description"));
		if (!StringUtil.isNullOrBlank(queryParams.getFirst("unitPrice"))) {
			setUnitPrice(new BigDecimal(queryParams.getFirst("unitPrice")));
		}

		// check if any required field is missing
		checkRequiredFields();
	}

	private long id;
	private String code;
	private String description;
	private BigDecimal unitPrice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public boolean isRequiredFieldMissing() {
		return false;
	}

}

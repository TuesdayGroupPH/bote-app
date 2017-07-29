package com.bote.delibeery.dto;

import java.math.BigDecimal;

/**
 * DTO class for Item information.
 *
 * @author MarkS
 *
 */
public class ItemDTO extends BaseDTO {

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

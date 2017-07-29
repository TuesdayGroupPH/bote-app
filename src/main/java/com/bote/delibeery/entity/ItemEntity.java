package com.bote.delibeery.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
public class ItemEntity implements Serializable {

	@Id
	@GeneratedValue(generator = "itemSeq")
	@SequenceGenerator(name = "itemSeq", sequenceName = "ITEM_SEQ")
	private long id;
	private String code;
	private String description;
	private BigDecimal unitPrice;
	private static final long serialVersionUID = 1L;

	public ItemEntity() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}

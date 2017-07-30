package com.bote.delibeery.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Index;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@Table(name = "item")
public class ItemEntity implements Serializable {

	@Id
	@GeneratedValue(generator = "itemSeq")
	@SequenceGenerator(name = "itemSeq", sequenceName = "ITEM_SEQ")
	@Column(name = "id")
	@Index
	private long id;

	@Column(name = "code")
	private String code;

	@Column(name = "description")
	private String description;

	@Column(name = "unit_price", precision = 10, scale = 2)
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

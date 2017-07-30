package com.bote.delibeery.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Index;

/**
 * Entity implementation class for Entity: AddressEntity
 *
 */
@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {

	@Id
	@GeneratedValue(generator = "adrsSeq")
	@SequenceGenerator(name = "adrsSeq", sequenceName = "ADRS_SEQ")
	@Column(name = "id")
	@Index
	private long id;

	@Column(name = "unit_floor_house_num")
	private String unitFloorHouseNum;

	@Column(name = "building")
	private String building;

	@Column(name = "street")
	private String street;

	@Column(name = "barangay_subd")
	private String barangaySubdivision;

	@Column(name = "city")
	private String city;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private CustomerEntity customer;

	private static final long serialVersionUID = 1L;

	public AddressEntity() {
		super();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the unitFloorHouseNum
	 */
	public String getUnitFloorHouseNum() {
		return unitFloorHouseNum;
	}

	/**
	 * @param unitFloorHouseNum
	 *            the unitFloorHouseNum to set
	 */
	public void setUnitFloorHouseNum(String unitFloorHouseNum) {
		this.unitFloorHouseNum = unitFloorHouseNum;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building
	 *            the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the barangaySubdivision
	 */
	public String getBarangaySubdivision() {
		return barangaySubdivision;
	}

	/**
	 * @param barangaySubdivision
	 *            the barangaySubdivision to set
	 */
	public void setBarangaySubdivision(String barangaySubdivision) {
		this.barangaySubdivision = barangaySubdivision;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the customer
	 */
	public CustomerEntity getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

}

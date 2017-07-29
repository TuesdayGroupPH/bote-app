package com.bote.delibeery.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: CustomerEntity
 *
 */
@Entity
@Table(name = "customer")
public class CustomerEntity implements Serializable {

	@Id
	@GeneratedValue(generator = "CustSeq")
	@SequenceGenerator(name = "CustSeq", sequenceName = "CUST_SEQ")
	private long id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String contactNumber;
	private static final long serialVersionUID = 1L;

	public CustomerEntity() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}

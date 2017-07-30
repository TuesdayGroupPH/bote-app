package com.bote.delibeery.bus.impl;

import com.bote.delibeery.bus.CustomerBus;
import com.bote.delibeery.dao.CustomerDAO;
import com.bote.delibeery.dto.CustomerDTO;
import com.bote.delibeery.entity.CustomerEntity;
import com.bote.delibeery.exception.RecordNotFoundException;

/**
 * This is the business class implementation of the Customer.
 *
 * @author MarkS
 *
 */
public class CustomerBusImpl implements CustomerBus {

	private CustomerDAO customerDAO;

	/**
	 * Constructor that initializes member variables.
	 *
	 */
	public CustomerBusImpl() {
		this.customerDAO = new CustomerDAO();
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO dto) {
		CustomerEntity entity = convertDTOToEntity(dto);
		customerDAO.create(entity);
		return convertEntityToDTO(entity);
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO dto) throws RecordNotFoundException {
		CustomerEntity entity = customerDAO.findById(dto.getId());
		if (entity == null) {
			throw new RecordNotFoundException("Customer record not found with id " + String.valueOf(dto.getId()));
		}

		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setEmailAddress(dto.getEmailAddress());
		entity.setContactNumber(dto.getContactNumber());
		customerDAO.update(entity);
		return convertEntityToDTO(entity);
	}

	@Override
	public CustomerEntity convertDTOToEntity(CustomerDTO dto) {
		CustomerEntity entity = new CustomerEntity();
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setEmailAddress(dto.getEmailAddress());
		entity.setContactNumber(dto.getContactNumber());
		return entity;
	}

	@Override
	public CustomerDTO convertEntityToDTO(CustomerEntity entity) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setEmailAddress(entity.getEmailAddress());
		dto.setContactNumber(entity.getContactNumber());
		return dto;
	}

}

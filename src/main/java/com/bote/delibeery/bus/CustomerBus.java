package com.bote.delibeery.bus;

import com.bote.delibeery.dto.CustomerDTO;
import com.bote.delibeery.entity.CustomerEntity;

/**
 * This is the interface for the Customer business implementation.
 *
 * @author MarkS
 *
 */
public interface CustomerBus extends BaseBus<CustomerDTO, CustomerEntity> {

	/**
	 * Creates a new customer record.
	 *
	 * @param dto
	 * @return CustomerDTO
	 */
	public CustomerDTO createCustomer(CustomerDTO dto);

	/**
	 * Updates a customer record.
	 *
	 * @param dto
	 * @return CustomerDTO
	 */
	public CustomerDTO updateCustomer(CustomerDTO dto);

}

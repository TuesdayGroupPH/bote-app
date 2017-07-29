package com.bote.delibeery.dao;

import com.bote.delibeery.entity.CustomerEntity;

/**
 * This is the DAO class for Customer entity.
 *
 * @author MarkS
 *
 */
public class CustomerDAO extends BaseDAO<CustomerEntity> {

	/**
	 * Find a customer record by id.
	 *
	 * @param id
	 * @return CustomerEntity
	 */
	public CustomerEntity findById(long id) {
		return getEntityManager().find(CustomerEntity.class, id);
	}

}

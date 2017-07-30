package com.bote.delibeery.dao;

import com.bote.delibeery.entity.ItemEntity;

public class ItemDAO extends BaseDAO<ItemEntity> {

	/**
	 * Finds an item record by id.
	 *
	 * @param id
	 * @return ItemEntity
	 */
	public ItemEntity findById(long id) {
		return getEntityManager().find(ItemEntity.class, id);
	}
}

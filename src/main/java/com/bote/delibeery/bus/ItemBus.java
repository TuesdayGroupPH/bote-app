package com.bote.delibeery.bus;

import com.bote.delibeery.dto.ItemDTO;
import com.bote.delibeery.entity.ItemEntity;

/**
 * The interface for Item business.
 *
 * @author MarkS
 *
 */
public interface ItemBus extends BaseBus<ItemDTO, ItemEntity> {

	/**
	 * Adds an item record.
	 *
	 * @param itemDTO
	 * @return ItemDTO
	 */
	public ItemDTO addItem(ItemDTO itemDTO);

}

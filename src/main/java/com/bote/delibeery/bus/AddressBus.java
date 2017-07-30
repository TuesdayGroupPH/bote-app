package com.bote.delibeery.bus;

import com.bote.delibeery.dto.AddressDTO;
import com.bote.delibeery.entity.AddressEntity;

/**
 * This is the interface for the address business.
 *
 * @author MarkS
 *
 */
public interface AddressBus extends BaseBus<AddressDTO, AddressEntity> {

	/**
	 * Creates an address record.
	 *
	 * @param addressDTO
	 * @return AddressDTO
	 */
	public AddressDTO addAddress(AddressDTO addressDTO);
}

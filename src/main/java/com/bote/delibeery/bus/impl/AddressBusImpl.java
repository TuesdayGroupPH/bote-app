package com.bote.delibeery.bus.impl;

import com.bote.delibeery.bus.AddressBus;
import com.bote.delibeery.dao.AddressDAO;
import com.bote.delibeery.dao.CustomerDAO;
import com.bote.delibeery.dto.AddressDTO;
import com.bote.delibeery.entity.AddressEntity;

/**
 * This is the business implementation class for the address information.
 *
 * @author MarkS
 *
 */
public class AddressBusImpl implements AddressBus {

	private AddressDAO addressDAO;

	/**
	 * Constructor that initializes the business implementation class.
	 *
	 */
	public AddressBusImpl() {
		this.addressDAO = new AddressDAO();
	}

	@Override
	public AddressDTO addAddress(AddressDTO addressDTO) {
		AddressEntity entity = convertDTOToEntity(addressDTO);
		addressDAO.create(entity);
		return convertEntityToDTO(entity);
	}

	@Override
	public AddressEntity convertDTOToEntity(AddressDTO dto) {
		AddressEntity entity = new AddressEntity();
		entity.setUnitFloorHouseNum(dto.getUnitFloorHouseNum());
		entity.setBuilding(dto.getBuilding());
		entity.setStreet(dto.getStreet());
		entity.setBarangaySubdivision(dto.getBarangaySubdivision());
		entity.setCity(dto.getCity());
		if (dto.getCustomerId() != 0L) {
			CustomerDAO custDAO = new CustomerDAO();
			entity.setCustomer(custDAO.findById(dto.getCustomerId()));
		}
		return entity;
	}

	@Override
	public AddressDTO convertEntityToDTO(AddressEntity entity) {
		AddressDTO dto = new AddressDTO();
		dto.setId(entity.getId());
		dto.setUnitFloorHouseNum(entity.getUnitFloorHouseNum());
		dto.setBuilding(entity.getBuilding());
		dto.setStreet(entity.getStreet());
		dto.setBarangaySubdivision(entity.getBarangaySubdivision());
		dto.setCity(entity.getCity());
		dto.setCustomerId(entity.getCustomer().getId());
		return dto;
	}

}

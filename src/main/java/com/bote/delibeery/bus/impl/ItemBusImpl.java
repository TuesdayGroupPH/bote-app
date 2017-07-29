package com.bote.delibeery.bus.impl;

import com.bote.delibeery.bus.ItemBus;
import com.bote.delibeery.dao.ItemDAO;
import com.bote.delibeery.dto.ItemDTO;
import com.bote.delibeery.entity.ItemEntity;

public class ItemBusImpl implements ItemBus {

	private ItemDAO itemDAO;

	public ItemBusImpl() {
		this.itemDAO = new ItemDAO();
	}

	@Override
	public ItemDTO addItem(ItemDTO itemDTO) {
		ItemEntity entity = convertDTOToEntity(itemDTO);
		itemDAO.create(entity);
		return convertEntityToDTO(entity);
	}

	@Override
	public ItemEntity convertDTOToEntity(ItemDTO dto) {
		ItemEntity entity = new ItemEntity();
		entity.setCode(dto.getCode());
		entity.setDescription(dto.getDescription());
		entity.setUnitPrice(dto.getUnitPrice());
		return entity;
	}

	@Override
	public ItemDTO convertEntityToDTO(ItemEntity entity) {
		ItemDTO dto = new ItemDTO();
		dto.setId(entity.getId());
		dto.setCode(entity.getCode());
		dto.setDescription(entity.getDescription());
		dto.setUnitPrice(entity.getUnitPrice());
		return dto;
	}

}

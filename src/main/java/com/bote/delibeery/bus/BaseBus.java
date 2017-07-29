package com.bote.delibeery.bus;

/**
 * This is the base interface for the business layer.
 *
 * @author MarkS
 *
 * @param <D>
 *            DTO class
 * @param <E>
 *            Entity class
 */
public interface BaseBus<D, E> {

	/**
	 * Converts the DTO to entity object.
	 *
	 * @param dto
	 * @return Entity
	 */
	public E convertDTOToEntity(D dto);

	/**
	 * Converts the Entity object to DTO.
	 *
	 * @param entity
	 * @return DTO
	 */
	public D convertEntityToDTO(E entity);

}

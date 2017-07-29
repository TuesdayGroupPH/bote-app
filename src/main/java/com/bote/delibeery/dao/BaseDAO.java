package com.bote.delibeery.dao;

import javax.persistence.EntityManager;

/**
 * This is the base class of the DAO layer.
 *
 * @author MarkS
 *
 * @param <E>
 *            Entity class
 */
public class BaseDAO<E> {

	/**
	 * Creates the EntityManager.
	 *
	 * @return EntityManager
	 */
	protected EntityManager getEntityManager() {
		return JPABean.getEmf().createEntityManager();
	}

	/**
	 * Persists the entity.
	 *
	 * @param entity
	 * @return E entity
	 */
	public E create(E entity) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entity);
		} finally {
			em.getTransaction().commit();
		}
		return entity;
	}

	/**
	 * Updates the entity.
	 *
	 * @param entity
	 * @return E entity
	 */
	public E update(E entity) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(entity);
		} finally {
			em.getTransaction().commit();
		}
		return entity;
	}
}

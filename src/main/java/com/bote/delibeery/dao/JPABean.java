package com.bote.delibeery.dao;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bote.delibeery.util.Constants;

/**
 * This is an application scoped bean that holds the EntityManagerFactory.
 *
 * @author MarkS
 *
 */
public class JPABean {

	private static EntityManagerFactory emf;

	/**
	 * Creates an EntityManagerFacotry.
	 *
	 * @return EntityManagerFactory
	 */
	protected static EntityManagerFactory getEmf() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT, new HashMap<String, String>());
		}

		return emf;
	}
}

/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO Documentar ApoenaDao
 *
 * @author andersonlf@gmail.com
 */
public abstract class ApoenaDao implements IApoenaDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApoenaDao.class);
	
	private EntityManager entityManager;
	
	public ApoenaDao(EntityManager em) {
		this.entityManager = em;
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaDao#getLogger()
	 */
	public Logger getLogger() {
		return LOGGER;
	}
	
	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaDao#getEntityManager()
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

}

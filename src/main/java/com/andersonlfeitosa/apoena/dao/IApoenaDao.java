/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;

/**
 * TODO Documentar IApoenaDao
 *
 * @author andersonlf@gmail.com
 */
public interface IApoenaDao {
	
	public Logger getLogger();
	
	public EntityManager getEntityManager();

}

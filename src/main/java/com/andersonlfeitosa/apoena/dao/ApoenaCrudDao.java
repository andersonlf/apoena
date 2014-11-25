/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.andersonlfeitosa.apoena.entity.ApoenaEntity;
import com.andersonlfeitosa.apoena.exceptions.ApoenaException;

/**
 * TODO Documentar ApoenaCrudDao
 *
 * @author andersonlf@gmail.com
 */
public abstract class ApoenaCrudDao<T extends ApoenaEntity> extends ApoenaDao implements IApoenaCrudDao<T> {
	
	private Class<T> clazz;
	
	public ApoenaCrudDao(EntityManager em, Class<T> clazz) {
		super(em);
		this.clazz = clazz;
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#add(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public T add(T object) {
		getEntityManager().persist(object);
		return object;
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#update(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public T update(T object) {
		getEntityManager().merge(object);
		return object;
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#remove(java.io.Serializable)
	 */
	public T remove(Serializable key) throws ApoenaException {
		T object = retrieve(key);
		
		if (object != null) {
			return object;
		}
		
		throw new ApoenaException();
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#retrieve(java.io.Serializable)
	 */
	public T retrieve(Serializable key) {
		return getEntityManager().find(clazz, key);
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#list()
	 */
	@SuppressWarnings("unchecked")
	public List<T> list() {
		Query query = getEntityManager().createQuery("from " + clazz);
		return query.getResultList();
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.dao.IApoenaCrudDao#list(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public abstract List<T> list(T object);

}

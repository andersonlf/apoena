/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.services;

import java.io.Serializable;
import java.util.List;

import com.andersonlfeitosa.apoena.dao.IApoenaCrudDao;
import com.andersonlfeitosa.apoena.entity.ApoenaEntity;
import com.andersonlfeitosa.apoena.exceptions.ApoenaException;

/**
 * TODO Documentar ApoenaServiceCrudEjb
 *
 * @author andersonlf@gmail.com
 */
public abstract class ApoenaCrudServiceEjb<T extends ApoenaEntity> extends ApoenaServiceEjb implements IApoenaCrudService<T> {

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#add(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public T add(T object) throws ApoenaException {
		return getDao().add(object);
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#update(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public T update(T object) throws ApoenaException {
		return getDao().update(object);
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#remove(java.io.Serializable)
	 */
	public T remove(Serializable key) throws ApoenaException {
		return getDao().remove(key);
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#retrieve(java.io.Serializable)
	 */
	public T retrieve(Serializable key) throws ApoenaException {
		return getDao().retrieve(key);
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#list()
	 */
	public List<T> list() throws ApoenaException {
		return getDao().list();
	}

	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#list(com.andersonlfeitosa.apoena.entity.ApoenaEntity)
	 */
	public List<T> list(T object) throws ApoenaException {
		return getDao().list(object);
	}
	
	/* (non-Javadoc)
	 * @see com.andersonlfeitosa.apoena.services.IApoenaCrudService#getDao()
	 */
	public abstract IApoenaCrudDao<T> getDao();

}

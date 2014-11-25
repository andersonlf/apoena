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
 * TODO Documentar IApoenaServiceCrud
 *
 * @author andersonlf@gmail.com
 */
public interface IApoenaCrudService<T extends ApoenaEntity> extends IApoenaService {
	
	T add(T object) throws ApoenaException;
	
	T update(T object) throws ApoenaException;
	
	T remove(Serializable key) throws ApoenaException;
	
	T retrieve(Serializable key) throws ApoenaException;
	
	List<T> list() throws ApoenaException;
	
	List<T> list(T object) throws ApoenaException;
	
	IApoenaCrudDao<T> getDao();

}

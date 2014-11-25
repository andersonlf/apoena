/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.dao;

import java.io.Serializable;
import java.util.List;

import com.andersonlfeitosa.apoena.entity.ApoenaEntity;
import com.andersonlfeitosa.apoena.exceptions.ApoenaException;

/**
 * TODO Documentar IApoenaCrudDao
 *
 * @author andersonlf@gmail.com
 */
public interface IApoenaCrudDao<T extends ApoenaEntity> extends IApoenaDao {
	
	T add(T object) throws ApoenaException;
	
	T update(T object) throws ApoenaException;
	
	T remove(Serializable key) throws ApoenaException;
	
	T retrieve(Serializable key) throws ApoenaException;
	
	List<T> list() throws ApoenaException;
	
	List<T> list(T object) throws ApoenaException;

}

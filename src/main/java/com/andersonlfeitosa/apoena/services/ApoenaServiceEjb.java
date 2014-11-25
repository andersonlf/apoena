/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO Documentar ApoenaServiceEjb
 *
 * @author andersonlf@gmail.com
 */
public abstract class ApoenaServiceEjb implements IApoenaService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApoenaServiceEjb.class);
	
	public Logger getLogger() {
		return LOGGER;
	}
	
}

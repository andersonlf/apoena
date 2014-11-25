/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.exceptions;

/**
 * TODO Documentar ApoenaRuntimeException
 *
 * @author andersonlf@gmail.com
 */
public class ApoenaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ApoenaException() { }
	
    public ApoenaException(String message) {
        super(message);
    }

    public ApoenaException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ApoenaException(Throwable cause) {
        super(cause);
    }
}

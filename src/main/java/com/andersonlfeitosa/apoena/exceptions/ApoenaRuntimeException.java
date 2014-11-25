/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.apoena.exceptions;

/**
 * TODO Documentar ApoenaRuntimeException
 *
 * @author andersonlf@gmail.com
 */
public class ApoenaRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ApoenaRuntimeException() { }
	
    public ApoenaRuntimeException(String message) {
        super(message);
    }

    public ApoenaRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ApoenaRuntimeException(Throwable cause) {
        super(cause);
    }
}

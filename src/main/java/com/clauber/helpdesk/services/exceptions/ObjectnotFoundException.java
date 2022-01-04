package com.clauber.helpdesk.services.exceptions;

public class ObjectnotFoundException extends RuntimeException {

	public ObjectnotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectnotFoundException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}

package com.clientui.exceptions;

public class ProducNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProducNotFoundException(String message) {
		super(message);
	}

}

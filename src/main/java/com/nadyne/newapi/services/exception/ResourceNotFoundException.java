package com.nadyne.newapi.services.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resouce not found. id"+ id);
	}
	
	
}

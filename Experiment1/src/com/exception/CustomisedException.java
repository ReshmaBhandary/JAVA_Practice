package com.exception;

public class CustomisedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	CustomisedException(String msg){
		super(msg);
		this.message=msg;
		
	}

}

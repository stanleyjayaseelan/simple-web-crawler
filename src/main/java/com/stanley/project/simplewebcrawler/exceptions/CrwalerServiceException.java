package com.stanley.project.simplewebcrawler.exceptions;

public class CrwalerServiceException extends RuntimeException {

	private static final long serialVersionUID = -4134554181555292981L;
	private String userMessage;
	private String developerMessage;

	public CrwalerServiceException(String userMessage, String developerMessage, Exception exception) {
		super(exception);
		this.userMessage = userMessage;
		this.developerMessage = developerMessage;
	}

	public CrwalerServiceException(String userMessage, String developerMessage) {
		this.userMessage = userMessage;
		this.developerMessage = developerMessage;
	}

	public CrwalerServiceException(String userMessage) {
		super(userMessage);
		this.userMessage = userMessage;
		this.developerMessage = "No developerMessage available";
	}

	public String getUserMessage() {
		return userMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

}

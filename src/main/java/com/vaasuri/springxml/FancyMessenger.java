package com.vaasuri.springxml;

public class FancyMessenger implements Messenger {

	private String message;
	private int id;
	
	public FancyMessenger() {
		id = (int) (10000 * Math.random());
	}
	
	@Override
	public void post() {
		System.out.println("**-**" + message + "**-**");
		System.out.println("Fancy Messenger ID: " + id);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

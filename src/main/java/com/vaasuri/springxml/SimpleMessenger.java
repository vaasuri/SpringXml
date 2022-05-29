package com.vaasuri.springxml;

public class SimpleMessenger implements Messenger {
	
	private String message;
	private int id;
	
	public SimpleMessenger() {
		id = (int) (10000 * Math.random());
	}

	@Override
	public void post() {
		System.out.println(message);
		System.out.println("Simple Messenger ID: " + id);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

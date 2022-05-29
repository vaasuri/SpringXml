package com.vaasuri.springxml;

public class Messenger {
	
	private String message;
	private int id;
	
	public Messenger() {
		id = (int) (10000 * Math.random());
	}

	public void post() {
		System.out.println(message);
		System.out.println("Messenger ID: " + id);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

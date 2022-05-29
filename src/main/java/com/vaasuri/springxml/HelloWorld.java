package com.vaasuri.springxml;

public class HelloWorld {
	
	private Messenger messenger;
	private int id;
	
	public HelloWorld() {
		id = (int) (10000 * Math.random());
	}
	
	public void message() {
		messenger.post();
		System.out.println("HelloWorld ID: " + id);
	}

	public Messenger getMessenger() {
		return messenger;
	}

	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	public int getLuckyNumber() {
		return id;
	}

	public void setLuckyNumber(int luckyNumber) {
		this.id = luckyNumber;
	}

}

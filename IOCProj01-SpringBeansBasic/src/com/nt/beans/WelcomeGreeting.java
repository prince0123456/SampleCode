package com.nt.beans;

public class WelcomeGreeting {

	static {
		System.out.println("WelcomeGreeting.Static block");
	}
	public WelcomeGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to 0 param constuctor");
	}
	public String welcome(String user) {
		return "welcome to string"+user;
	}
}

package com.java.oops;

public abstract class AbstractDemo {

	public void execute() {
		getReady();
		dothedish();
		cleanup();
	}

	abstract void getReady();

	abstract void dothedish();

	abstract void cleanup();

}

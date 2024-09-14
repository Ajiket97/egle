package com.egle.base;

public class InvalidBrowserException extends Exception{
	private String msg;

	public InvalidBrowserException(String browserNmae) {
           this.msg = "InvalidBrowserException"+browserNmae;
	}
	@Override
	public String getMessage() {
		
		return msg;
	}
}

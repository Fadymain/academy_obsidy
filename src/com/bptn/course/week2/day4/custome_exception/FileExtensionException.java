package com.bptn.course.week2.day4.custome_exception;

public class FileExtensionException extends Exception {
	String message;

	public FileExtensionException(String message) {
		super(message);
	}
}

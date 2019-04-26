package com.capg.IncomeTax.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNotFoundException extends RuntimeException{

	public IdNotFoundException(String msg) {
		super(msg);
	}
}

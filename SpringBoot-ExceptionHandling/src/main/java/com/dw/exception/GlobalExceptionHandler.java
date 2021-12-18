package com.dw.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class GlobalExceptionHandler {

	/*
	 * @ExceptionHandler(value = NoProductFoundException.class) public
	 * ResponseEntity<Object> handleNoProductFoundException() { return new
	 * ResponseEntity<>(HttpStatus.BAD_REQUEST); }
	 */

	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<ApiError> handleNoProductFoundException() {
		ApiError error = new ApiError(400, "No Product Found", new Date());
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}
}

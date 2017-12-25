package com.egiants.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.egiants.model.ErrorMessage;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public final static ResponseEntity<ErrorMessage> somethingWentWrong(RuntimeException ex){
		ErrorMessage exceptionResponse=new ErrorMessage(ex.getMessage(),HttpStatus.BAD_REQUEST.value(),ex.toString());
		return new ResponseEntity<ErrorMessage>(exceptionResponse,new HttpHeaders(),HttpStatus.BAD_REQUEST);
		
	}
	
}

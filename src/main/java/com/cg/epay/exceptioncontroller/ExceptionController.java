package com.cg.epay.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.epay.exception.EntityAlreadyExistsException;
import com.cg.epay.exception.ValidationException;
import com.cg.epay.factory.ObjectFactory;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorMessage> handleValidationException(ValidationException ex) {
		ErrorMessage error = ObjectFactory.createObject(ErrorMessage::new);
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		error.setErrorCode(httpStatus.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<ErrorMessage>(error, httpStatus);
	}

	@ExceptionHandler(EntityAlreadyExistsException.class)
	public ResponseEntity<ErrorMessage> handleEntityAlreadyExistsExceptionException(EntityAlreadyExistsException ex) {
		ErrorMessage error = ObjectFactory.createObject(ErrorMessage::new);
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		error.setErrorCode(httpStatus.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<ErrorMessage>(error, httpStatus);
	}
}

package com.allan.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Integer stauts, String msg, Long timeStamp) {
		super(stauts, msg, timeStamp);

	}

	public List<FieldMessage> getErrors() {
		return errors;

	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}

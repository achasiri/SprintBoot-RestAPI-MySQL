package com.egiants.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.egiants.model.ItemModel;

public class ItemValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return ItemModel.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

}

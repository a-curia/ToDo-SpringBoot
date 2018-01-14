package com.dbbyte.learn.util;

import com.dbbyte.learn.entity.ToDo;

public class PayloadValidator {
	
	public static boolean validateCreatePayload(ToDo toDo){
		if (toDo.getId() > 0){
			return false;
		}
		return true;
	}

}
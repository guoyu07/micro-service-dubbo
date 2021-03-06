package com.cxytiandi.common.exception;

import com.cxytiandi.common.base.ResponseCode;

public class ParamException extends GlobalException {
	private static final long serialVersionUID = 6021390821349937519L;

	public ParamException(String message) {
		super(message, ResponseCode.PARAM_ERROR_CODE.getCode());
	}

}

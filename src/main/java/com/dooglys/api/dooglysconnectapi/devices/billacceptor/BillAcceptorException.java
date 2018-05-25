package com.dooglys.api.dooglysconnectapi.devices.billacceptor;

import com.dooglys.api.dooglysconnectapi.common.GeneralException;

public class BillAcceptorException extends GeneralException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BillAcceptorException(BillAcceptorExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

package com.dooglys.api.dooglys_connect_api.devices.billacceptor;

import com.dooglys.api.dooglys_connect_api.common.GeneralException;

public class BillAcceptorException extends GeneralException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BillAcceptorException(BillAcceptorExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

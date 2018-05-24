package devices.billacceptor;

import common.GeneralException;

public class BillAcceptorException extends GeneralException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BillAcceptorException(BillAcceptorExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

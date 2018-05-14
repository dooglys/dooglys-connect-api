package exceptions.classes;

import exceptions.types.BankTerminalExceptionType;

/**
 * Created by aldom on 10.11.2017.
 */
public class BankTerminalException extends GeneralException {

    public BankTerminalException(BankTerminalExceptionType type, String fullDescription, Throwable cause) {
        super(type, fullDescription, cause);
    }
}

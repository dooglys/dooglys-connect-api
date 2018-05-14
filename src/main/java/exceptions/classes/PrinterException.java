package exceptions.classes;

import exceptions.types.PrinterExceptionType;

public class PrinterException extends GeneralException {
    public PrinterException(PrinterExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

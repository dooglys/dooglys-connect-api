package devices.printer;

import common.GeneralException;

public class PrinterException extends GeneralException {
    public PrinterException(PrinterExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

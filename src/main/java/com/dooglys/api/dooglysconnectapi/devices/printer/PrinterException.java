package com.dooglys.api.dooglysconnectapi.devices.printer;

import com.dooglys.api.dooglysconnectapi.common.GeneralException;

public class PrinterException extends GeneralException {
    public PrinterException(PrinterExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

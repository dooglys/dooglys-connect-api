package com.dooglys.api.dooglys_connect_api.devices.printer;

import com.dooglys.api.dooglys_connect_api.common.GeneralException;

public class PrinterException extends GeneralException {
    public PrinterException(PrinterExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

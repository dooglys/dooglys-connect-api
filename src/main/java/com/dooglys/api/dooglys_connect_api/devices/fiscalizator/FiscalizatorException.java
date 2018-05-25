package com.dooglys.api.dooglys_connect_api.devices.fiscalizator;

import com.dooglys.api.dooglys_connect_api.common.GeneralException;

/**
 * Created by aldom on 09.10.2017.
 */
public class FiscalizatorException extends GeneralException {
    public FiscalizatorException(FiscalizatorExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

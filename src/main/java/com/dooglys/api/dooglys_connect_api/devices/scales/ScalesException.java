package com.dooglys.api.dooglys_connect_api.devices.scales;

import com.dooglys.api.dooglys_connect_api.common.GeneralException;

public class ScalesException extends GeneralException {
    public ScalesException(ScalesExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

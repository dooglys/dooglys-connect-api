package com.dooglys.api.dooglysconnectapi.devices.scales;

import com.dooglys.api.dooglysconnectapi.common.GeneralException;

public class ScalesException extends GeneralException {
    public ScalesException(ScalesExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

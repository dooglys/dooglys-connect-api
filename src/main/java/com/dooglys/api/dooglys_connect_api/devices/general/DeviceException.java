package com.dooglys.api.dooglys_connect_api.devices.general;

import com.dooglys.api.dooglys_connect_api.common.GeneralException;

/**
 * Created by aldom on 09.10.2017.
 */
public class DeviceException extends GeneralException {
    public DeviceException(DeviceExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

package devices.fiscalizator;

import common.GeneralException;

/**
 * Created by aldom on 09.10.2017.
 */
public class FiscalizatorException extends GeneralException {
    public FiscalizatorException(FiscalizatorExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

package devices.scales;

import common.GeneralException;

public class ScalesException extends GeneralException {
    public ScalesException(ScalesExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

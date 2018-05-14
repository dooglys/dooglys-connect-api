package exceptions.classes;

import exceptions.types.ScalesExceptionType;

public class ScalesException extends GeneralException {
    public ScalesException(ScalesExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}

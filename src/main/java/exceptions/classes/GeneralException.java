package exceptions.classes;

public abstract class GeneralException extends Exception {

    protected Enum type;
    protected String localizedMessage;

    public GeneralException(Enum type, String localizedMessage, Throwable cause) {
        super(String.format("[%s] %s", type.name(), localizedMessage));
        this.type = type;
        this.localizedMessage = localizedMessage;
        this.initCause(cause);
    }

    @Override
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    @Override
    public String toString() {
        return getMessage();
    }

    public Enum getType() {
        return type;
    }


}

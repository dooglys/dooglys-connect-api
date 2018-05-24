package settings;

import settings.types.ConnectionType;

public class Connection {

    private ConnectionType type;
    private String parameter;

    public Connection(ConnectionType type, String parameter) {
        this.type = type;
        this.parameter = parameter;
    }

    public ConnectionType getConnectionType() {
        return type;
    }

    public String getParameter() {
        return parameter;
    }
}

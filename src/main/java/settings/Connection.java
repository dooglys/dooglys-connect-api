package settings;

import settings.types.ConnectionType;

public class Connection {

    ConnectionType type;
    String parameter;

    Connection(ConnectionType type, String parameter) {
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

package com.dooglys.api.dooglys_connect_api.settings;

import com.dooglys.api.dooglys_connect_api.settings.types.ConnectionType;

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

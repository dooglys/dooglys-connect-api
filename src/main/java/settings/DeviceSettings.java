package settings;

import settings.types.ConnectionType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeviceSettings {

    Connection connection;
    Map<String, String> settings;

    public DeviceSettings(ConnectionType connectionType, String connectionParameter) {
        settings = new HashMap<>();
        connection = new Connection(connectionType, connectionParameter);
    }

    DeviceSettings(Connection connection, Map<String, String> settings) {
        this.connection = connection;
        this.settings = settings;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setSingleSetting(String settingName, String value) {
        settings.put(settingName, value);
    }

    public void setMultipleSettings(Map<String, String> settingsMap) {
        Iterator iterator = settingsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry setting = (Map.Entry) iterator.next();
            settings.put((String) setting.getKey(), (String) setting.getValue());
        }
    }

    public String getSettingString(String settingName) {
        return settings.get(settingName);
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public String toString() {
        return String.format("[Подключение: %s (%s), Дополнительные настройки: %s]", connection.getConnectionType(), connection.getParameter(), settings);
    }

}

package beans;

import types.ConnectionType;

import java.util.HashMap;

public class DeviceBean {

    private int deviceId;
    private String deviceSpecName;
    private String driverClass;
    private ConnectionType connectionType;
    private String deviceType;
    private String connectionParam;

    public DeviceBean(int deviceId, String deviceSpecName, String driverClass, String connectionType, String deviceType, String connectionParam) {
        this.deviceId = deviceId;
        this.deviceSpecName = deviceSpecName;
        this.driverClass = driverClass;
        this.connectionType = ConnectionType.valueOf(connectionType);
        this.deviceType = deviceType;
        this.connectionParam = connectionParam;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceSpecName() {
        return deviceSpecName;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getConnectionParam() {
        return connectionParam;
    }

    @Override
    public String toString() {
        return String.format("[Устройство: %s, Идентификатор: %d, Драйвер: %s, Тип устройства: %s, Тип соединения: %s, Параметр соединения: %s]",
                deviceSpecName, deviceId, driverClass, deviceType, connectionType, connectionParam);
    }

    public HashMap<String, Object> toHashMap() {

        HashMap<String, Object> deviceBeanMap = new HashMap<>();

        deviceBeanMap.put("deviceId", deviceId);
        deviceBeanMap.put("deviceSpecName", deviceSpecName);
        deviceBeanMap.put("driverClass", driverClass);
        deviceBeanMap.put("connectionType", connectionType.toString());
        deviceBeanMap.put("deviceType", deviceType);
        deviceBeanMap.put("connectionParam", connectionParam);

        return deviceBeanMap;
    }
}

package com.dooglys.api.dooglys_connect_api.devices.general;

import com.dooglys.api.dooglys_connect_api.settings.Connection;
import com.dooglys.api.dooglys_connect_api.settings.DeviceSettings;

public interface Device {

    /**
     * Инициализация устройства.
     *
     * @param deviceSettings USB порт, IP адрес и т.п.
     * @throws DeviceException
     */
    void initialize(Connection connection, DeviceSettings deviceSettings) throws DeviceException;

    /**
     * Осуществляет попытку подключения устройства
     *
     * @throws DeviceException
     */
    void connect() throws DeviceException;

    /**
     * Возвращает состояние подключения устройства
     *
     * @return
     * @throws DeviceException
     */
    boolean isConnected() throws DeviceException;

}

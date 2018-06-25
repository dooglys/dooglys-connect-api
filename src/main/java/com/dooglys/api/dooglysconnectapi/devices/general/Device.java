package com.dooglys.api.dooglysconnectapi.devices.general;

import com.dooglys.api.dooglysconnectapi.settings.Connection;
import com.dooglys.api.dooglysconnectapi.settings.DeviceSettings;

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

    /**
     * Завершает работу с устройством. Освобождает занятый порт и т.п.
     *
     * @throws DeviceException
     */
    void finalize() throws DeviceException;

}

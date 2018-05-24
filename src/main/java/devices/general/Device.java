package devices.general;

import settings.Connection;
import settings.DeviceSettings;

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

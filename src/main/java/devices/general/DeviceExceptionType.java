package devices.general;

/**
 * Created by aldom on 09.10.2017.
 */
public enum DeviceExceptionType {

    DEVICE_INITIALIZATION_ERROR("Ошибка инициализации устройства"),
    UPDATE_STATE_ERROR("Ошибка обновления состояния устройства"),
    CONNECT_ERROR("Ошибка подключения устройства");

    public final String description;

    DeviceExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}

package com.dooglys.api.dooglysconnectapi.devices.scales;

public enum ScalesExceptionType {

    COMMAND_IS_NOT_SUPPORTED("Команда не поддерживается оборудованием"),
    GET_WEIGHT_ERROR("Не удалось получить вес"),
    CONNECTION_ERROR("Не удалось подключиться к устройству");

    public final String description;

    ScalesExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}

package com.dooglys.api.dooglys_connect_api.devices.fiscalizator;

/**
 * Created by aldom on 09.10.2017.
 */
public enum FiscalizatorExceptionType {

    GET_STATUS_ERROR ("Ошибка получения состояния"),
    FN_ERROR("Ошибка фискального накопителя"),
    CHECK_REGISTRATION_ERROR("Ошибка регистрации чека"),
    SESSION_ERROR("Ошибка смены"),
    HEADER_PRINT_ERROR ("Ошибка печати заголовка чека");

    public final String description;

    FiscalizatorExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}

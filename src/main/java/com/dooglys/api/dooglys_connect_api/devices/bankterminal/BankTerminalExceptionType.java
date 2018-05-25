package com.dooglys.api.dooglys_connect_api.devices.bankterminal;

/**
 * Created by aldom on 10.11.2017.
 */
public enum BankTerminalExceptionType {

    PAYMENT_ERROR("Ошибка оплаты"),
    CANCEL_PAYMENT_ERROR("Ошибка отмены оплаты"),
    SETTLEMENT_ERROR("Ошибка сверки итогов");

    public final String description;

    BankTerminalExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}

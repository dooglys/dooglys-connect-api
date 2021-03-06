package com.dooglys.api.dooglysconnectapi.devices.billacceptor;

public enum BillAcceptorExceptionType {

    STACKING_ERROR("Ошибка добавления банкноты в стеккер"),
    RETURN_ERROR("Ошибка возврата банкноты"),
    SYSTEM_ERROR("Ошибка работы с купюроприемником");

    public final String description;

    BillAcceptorExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}

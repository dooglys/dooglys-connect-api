package com.dooglys.api.dooglysconnectapi.devices.bankterminal;

import com.dooglys.api.dooglysconnectapi.devices.general.Device;

public interface BankTerminal extends Device {

    /**
     * Оплата картой
     *
     * @param amount
     * @throws BankTerminalException
     */
    void payByPaymentCard(Double amount) throws BankTerminalException;

    /**
     * Отмена оплаты
     *
     * @param amount
     * @param rrnCode
     * @throws BankTerminalException
     */
    void cancelPaymentByPaymentCard(Double amount, String rrnCode) throws BankTerminalException;

    /**
     * Сверка итогов
     *
     * @throws BankTerminalException
     */
    void settlement() throws BankTerminalException;

    /**
     * Сводный чек
     *
     * @throws BankTerminalException
     */
    void consolidation() throws BankTerminalException;

    /**
     * Получить код RRN
     *
     * @return
     */
    String getRRNcode();

    /**
     * Получить код авторизации
     *
     * @return
     */
    String getAuthorizationCode();

    /**
     * Получить слип-чек
     *
     * @return
     */
    String getSlipCheck();

    /**
     * Открыть сервисное меню
     *
     * @return
     */
    void openServiceMenu();

}

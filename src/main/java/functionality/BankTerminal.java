package functionality;

import exceptions.classes.BankTerminalException;

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

}

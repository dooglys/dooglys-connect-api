package com.dooglys.api.dooglysconnectapi.devices.fiscalizator;

import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.types.*;
import com.dooglys.api.dooglysconnectapi.devices.printer.Printer;

import java.util.Date;
import java.util.List;

public interface Fiscalizator extends Printer {


    /**
     * Регистрация и фискализация ККМ
     * @param organizationInn
     * @param registrationNumber
     * @param cashierName
     * @param taxVariants
     * @param changeFN
     * @throws FiscalizatorException
     */
    void fiscalization(String organizationInn, String registrationNumber, String cashierName, List<String> taxVariants, boolean changeFN) throws FiscalizatorException;

    /**
     * Закрытие ФН
     * @param cashierName
     * @throws FiscalizatorException
     */
    void closeFN(String cashierName) throws FiscalizatorException;

    /**
     * Установка названия организации
     * @param organizationName
     * @throws FiscalizatorException
     */
    void setOrganizationName(String organizationName) throws FiscalizatorException;

    /**
     * Установка адреса организации
     * @param organizationAddress
     * @throws FiscalizatorException
     */
    void setOrganizationAddress(String organizationAddress) throws FiscalizatorException;

    /**
     * Установка адреса установки ККТ
     * @param addressSettle
     * @throws FiscalizatorException
     */
    void setAddressSettle(String addressSettle) throws FiscalizatorException;

    /**
     * Установка названия ОФД
     * @param ofdName
     * @throws FiscalizatorException
     */
    void setOFDName(String ofdName) throws FiscalizatorException;

    /**
     * Установка ИНН ОФД
     * @param ofdinn
     * @throws FiscalizatorException
     */
    void setOFDINN(String ofdinn) throws FiscalizatorException;

    /**
     * Установка адреса сервера ОФД
     * @param ofdServerURL
     * @throws FiscalizatorException
     */
    void setOFDServerURL(String ofdServerURL) throws FiscalizatorException;

    /**
     * Установка порта сервера ОФД
     * @param ofdServerPort
     * @throws FiscalizatorException
     */
    void setOFDServerPort(String ofdServerPort) throws FiscalizatorException;

    /**
     * Установка email отправителя чека
     * @param senderEmail
     * @throws FiscalizatorException
     */
    void setSenderEmail(String senderEmail) throws FiscalizatorException;

    /**
     *
     * Открыть фискальный чек
     *
     * @param checkType
     * @param cashierName
     * @param taxVariant
     * @param cashierVatIn
     * @throws FiscalizatorException
     */
    void openFiscalCheck(CheckType checkType, String cashierName, String cashierVatIn, String taxVariant) throws FiscalizatorException;

    /**
     * Открыть нефискальный чек
     *
     * @throws FiscalizatorException
     */
    void openNonFiscalCheck() throws FiscalizatorException;

    /**
     * Регистрация позиции фискального чека
     *
     * @param name       название позиции
     * @param quantity   количество товара
     * @param price      цена за единицу товара
     * @param amount     общая цена с учетом скидок/надбавок (может отличаться от quantity * price)
     * @param department номер отделла
     * @param tax        тип налога
     * @throws FiscalizatorException
     */
    void register(String name, double quantity, double price, double amount, int department, TaxType tax) throws FiscalizatorException;

    /**
     * Регистация оплаты
     *
     * @param type
     * @param amount
     * @throws FiscalizatorException
     */
    void payment(PaymentType type, double amount) throws FiscalizatorException;

    /**
     * Закрытие фискального чека
     *
     * @throws FiscalizatorException
     */
    void closeFiscalCheck(String clientAddress) throws FiscalizatorException;

    /**
     * Закрытие нефискального чека
     *
     * @throws FiscalizatorException
     */
    void closeNonFiscalCheck() throws FiscalizatorException;

    /**
     * Отмена фискального чека
     *
     * @throws FiscalizatorException
     */
    void cancelCheck() throws FiscalizatorException;

    /**
     * Внесение наличных в кассу
     *
     * @param cashierName   Имя кассира
     * @param cashierVatIn  ИНН кассира
     * @param amount        Сумма
     * @throws FiscalizatorException
     */
    void depositingCash(String cashierName, String cashierVatIn, double amount) throws FiscalizatorException;

    /**
     * Изъятие наличных из кассы
     *
     * @param cashierName   Имя кассира
     * @param cashierVatIn  ИНН кассира
     * @param amount        Сумма
     * @throws FiscalizatorException
     */
    void paymentCash(String cashierName, String cashierVatIn, double amount) throws FiscalizatorException;

    /**
     * Получение состояния чека
     *
     * @return 0/1 соответственно для закрытого/открытого чек
     * @throws FiscalizatorException
     */
    int getCheckState() throws FiscalizatorException;

    /**
     * Получение номера последнего чека не отправленного в ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    int getCheckNumber() throws FiscalizatorException;

    /**
     * Получение шифра QR кода последнего чека
     *
     * @return
     * @throws FiscalizatorException
     */
    String getCheckQRcode() throws FiscalizatorException;

    /**
     * Открытие смены
     *
     * @throws FiscalizatorException
     */
    void openSession() throws FiscalizatorException;

    /**
     * Регистрация X-отчета (промежуточный)
     *
     * @throws FiscalizatorException
     */
    void xReport() throws FiscalizatorException;

    /**
     * Регистрация Z-отчета (закрытие смены)
     *
     * @param cashierName
     * @throws FiscalizatorException
     */
    void zReport(String cashierName) throws FiscalizatorException;

    /**
     * Получение шифра QR кода последнего фискального документа
     *
     * @return
     * @throws FiscalizatorException
     */
    String getDocQRcode() throws FiscalizatorException;

    /**
     * Получение текущей общей суммы наличных в смене (с учетом прихода/расхода)
     *
     * @return
     * @throws FiscalizatorException
     */
    double getBalanceCash() throws FiscalizatorException;

    /**
     * Получение флага фискальности ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    boolean isFiscal() throws FiscalizatorException;

    /**
     * Флаг переполнения памяти ФН
     *
     * @return
     * @throws FiscalizatorException
     */
    boolean isOverflowFN() throws FiscalizatorException;

    /**
     * Получение статуса смены
     *
     * @return 1 - закрыта ; 2 - открыта, корректно ; 3 - открыта, прошло более чем 24 часа
     * @throws FiscalizatorException
     */
    int getSessionState() throws FiscalizatorException;

    /**
     * Получение номера смены
     *
     * @return
     * @throws FiscalizatorException
     */
    int getSessionNumber() throws FiscalizatorException;

    /**
     * Получение типов налогооблажения, установленных в ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    List<String> getTaxVariants() throws FiscalizatorException;

    /**
     * Получение названия зарегистрированной организации
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOrganizationName() throws FiscalizatorException;

    /**
     * Получение ИНН зарегистрированной организации
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOrganizationINN() throws FiscalizatorException;

    /**
     * Получение адреса зарегистрированной организации
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOrganizationAddress() throws FiscalizatorException;

    /**
     * Получение адреса установки ККТ
     *
     * @throws FiscalizatorException
     */
    String getAddressSettle() throws FiscalizatorException;

    /**
     * Получение email отправителя чека
     *
     * @return
     * @throws FiscalizatorException
     */
    String getSenderEmail() throws FiscalizatorException;

    /**
     * Получение серийного номера ФН
     *
     * @return
     * @throws FiscalizatorException
     */
    String getNumberFN() throws FiscalizatorException;

    /**
     * Получение номера регистрации ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    String getRegistrationNumber() throws FiscalizatorException;

    /**
     * Получение даты окончания ргистрации ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    Date getRegistrationEnd() throws FiscalizatorException;

    /**
     * Получение названия ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOFDName() throws FiscalizatorException;

    /**
     * Получение ИНН ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOFDINN() throws FiscalizatorException;

    /**
     * Получение URL сервера проверки чека
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOFDServerURL() throws FiscalizatorException;

    /**
     * Получение порта сервера проверки чека
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOFDServerPort() throws FiscalizatorException;

    /**
     * Получение описания ошибки ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    String getOFDError() throws FiscalizatorException;

    /**
     * Получение номера первого незарегистрированного документа в ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    int getFirstUnregisteredDocNumber() throws FiscalizatorException;

    /**
     * Получение даты первого незарегистрированного документа в ОФД
     *
     * @return
     * @throws FiscalizatorException
     */
    Date getFirstUnregisteredDocDate() throws FiscalizatorException;
}

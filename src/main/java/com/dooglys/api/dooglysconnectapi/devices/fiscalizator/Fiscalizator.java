package com.dooglys.api.dooglysconnectapi.devices.fiscalizator;

import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.structures.CheckInfo;
import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.structures.DocumentInfo;
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
     * @throws FiscalizatorException
     */
    void fiscalization(String organizationInn, String registrationNumber, String cashierName) throws FiscalizatorException;

    /**
     * Перерегистрация ККМ
     * @param reason
     * @param cashierName
     * @throws FiscalizatorException
     */
    void refiscalization(RefiscalizationReason reason, String cashierName) throws FiscalizatorException;

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
     * Установка СНО организации
     * @param taxVarinats
     * @throws FiscalizatorException
     */
    void setTaxVarinats(List<TaxVariant> taxVarinats) throws FiscalizatorException;

    /**
     * Установка адреса установки ККТ
     * @param addressSettle
     * @throws FiscalizatorException
     */
    void setAddressSettle(String addressSettle) throws FiscalizatorException;

    /**
     * Установка места установки ККТ
     * @param placeSettle
     * @throws FiscalizatorException
     */
    void setPlaceSettle(String placeSettle) throws FiscalizatorException;

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
     * Установка ИНН ОФД
     * @param ffdVersion
     * @throws FiscalizatorException
     */
    void setFFDVersion(FFDVersion ffdVersion) throws FiscalizatorException;

    /**
     * Установка признака шифрования
     * @param flag
     */
    void setEncryptionMode(boolean flag) throws FiscalizatorException;

    /**
     * Установка автономного режима
     * @param flag
     */
    void setOfflineMode(boolean flag) throws FiscalizatorException;

    /**
     * Установка автоматического режима
     * @param flag
     */
    void setAutomaticMode(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака расчетов в Интернете
     * @param flag
     */
    void setInternetMode(boolean flag) throws FiscalizatorException;

    /**
     * Применение бланков строгой отчетности
     * @param flag
     */
    void setBSOMode(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака применения в сфере услуг
     * @param flag
     */
    void setServiceMode(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака установки принтера в автомате (Для ФФД 1.05 и выше)
     * @param flag
     */
    void setPrinterAutomatic(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака продажи подакцизного товара (Для ФФД 1.1 и выше)
     * @param flag
     * @throws FiscalizatorException
     */
    void setSaleExcisableGoods(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака проведения азартных игр (Для ФФД 1.1 и выше)
     * @param flag
     * @throws FiscalizatorException
     */
    void setSignOfGambling(boolean flag) throws FiscalizatorException;

    /**
     * Установка признака проведения лотереи (Для ФФД 1.1 и выше)
     * @param flag
     * @throws FiscalizatorException
     */
    void setSignOfLottery(boolean flag) throws FiscalizatorException;

    /**
     * Установка кодов признаков агента (Для ФФД 1.1 и выше)
     * @param agentSigns
     * @throws FiscalizatorException
     */
    void setSignOfAgent(List<AgentSign> agentSigns) throws FiscalizatorException;

    /**
     * Установка номера автомата
     * @param number
     */
    void setAutomaticNumber(String number) throws FiscalizatorException;

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
    void openFiscalCheck(CheckType checkType, String cashierName, String cashierVatIn, TaxVariant taxVariant) throws FiscalizatorException;

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
     * Регистрация чека коррекции
     *
     * @param correctionCheckType   тип чека коррекции
     * @param correctionType        тип коррекции
     * @param docNum                номер документа основания для коррекции
     * @param docName               наименование основания для коррекции
     * @param docDate               номер документа основания для коррекции
     * @param cashierName           имя оператора
     * @param cashierVatIn          ИНН оператора
     * @param taxVariant            система налогооблажения
     * @param cash                  коррекция наличными
     * @param card                  коррекция картой
     * @param advance               коррекция авансом
     * @param credit                коррекция кредитом
     * @param provision             коррекция обменом
     * @param sumVatNo              сумма расчёта по чеку без НДС
     * @param sumVat0               сумма НДС чека по ставке 0%
     * @param sumVat10              сумма НДС чека по ставке 10%
     * @param sumVat18              сумма НДС чека по ставке 18%
     * @param sumVat110             сумма НДС чека по ставке 10/110
     * @param sumVat118             сумма НДС чека по ставке 18/118
     * @throws FiscalizatorException
     */
    void correction(CorrectionCheckType correctionCheckType, CorrectionType correctionType, String docNum, String docName, Date docDate, String cashierName, String cashierVatIn, TaxVariant taxVariant, double cash, double card, double advance, double credit, double provision, double sumVatNo, double sumVat0, double sumVat10, double sumVat18, double sumVat110, double sumVat118) throws FiscalizatorException;

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
     * Получение данных о последнем чеке
     *
     * @return
     * @throws FiscalizatorException
     */
    CheckInfo getCheckInfo() throws FiscalizatorException;

    /**
     * Получение данных о последнем документе
     *
     * @return
     * @throws FiscalizatorException
     */
    DocumentInfo getDocumentInfo() throws FiscalizatorException;

    /**
     * Получение состояния текущего чека
     *
     * @throws FiscalizatorException
     */
    int getCheckState() throws FiscalizatorException;

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
    List<TaxVariant> getTaxVariants() throws FiscalizatorException;

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
     * Получение адреса установки ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    String getAddressSettle() throws FiscalizatorException;

    /**
     * Получение места установки ККТ
     *
     * @throws FiscalizatorException
     */
    String getPlaceSettle() throws FiscalizatorException;

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

    /**
     * Получение зарегистрированной версии ФФД (тег 1209)
     *
     * @return
     * @throws FiscalizatorException
     */
    FFDVersion getFFDVersion() throws FiscalizatorException;

    /**
     * Получение максимально поддерживаемой версии ФФД на установленном ФН (тег 1190)
     *
     * @return
     * @throws FiscalizatorException
     */
    FFDVersion getFFDVersionFN() throws FiscalizatorException;

    /**
     * Получение максимально поддерживаемой версии ФФД в текущей версии ПО ККТ (тег 1189)
     *
     * @return
     * @throws FiscalizatorException
     */
    FFDVersion getFFDVersionKKT() throws FiscalizatorException;

    /**
     * Получение флага инкассации ККТ перед закрытием смены
     *
     * @return
     * @throws FiscalizatorException
     */
    boolean getEncashment() throws FiscalizatorException;

    /**
     * Отправка команды на перезагрузку ККМ
     * @return
     * @throws FiscalizatorException
     */
    void reboot() throws FiscalizatorException;

}

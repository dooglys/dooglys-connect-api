package com.dooglys.api.dooglysconnectapi.devices.printer;

import com.dooglys.api.dooglysconnectapi.devices.general.Device;
import com.dooglys.api.dooglysconnectapi.devices.printer.types.*;

public interface Printer extends Device {

    /**
     * Печать строки текста
     *
     * @param text     строка текста
     * @param fontSize размер шрифта
     * @throws PrinterException
     */
    void printText(String text, FontSize fontSize) throws PrinterException;

    /**
     * Печать изображения
     * Изображение должно быть закодировано в base64
     *
     * @param base64
     * @throws PrinterException
     */
    void printImage(String base64) throws PrinterException;

    /**
     * Печать штрихкода
     *
     * @param type  тип штрихкода
     * @param value
     * @throws PrinterException
     */
    void printBarcode(BarcodeType type, String value) throws PrinterException;

    /**
     * Отрезка чека
     *
     * @throws PrinterException
     */
    void cut() throws PrinterException;

    /**
     * Флаг отсутствия бумаги
     *
     * @return
     * @throws PrinterException
     */
    boolean isPaperOver() throws PrinterException;

    /**
     * Получение ширины чековой ленты
     *
     * @return
     * @throws PrinterException
     */
    int getCheckWidth(FontSize fontSize) throws PrinterException;

    /**
     * Получение серийного номера ККТ
     *
     * @return
     * @throws PrinterException
     */
    String getSerialNumber() throws PrinterException;

}

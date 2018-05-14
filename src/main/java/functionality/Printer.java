package functionality;

import exceptions.classes.FiscalizatorException;
import exceptions.classes.PrinterException;
import types.BarcodeType;
import types.FontSize;

public interface Printer extends Device {

    /**
     * Печать строки текста
     *
     * @param text     строка текста
     * @param fontSize размер шрифта
     * @throws FiscalizatorException
     */
    void printText(String text, FontSize fontSize) throws PrinterException;

    /**
     * Печать изображения
     * Изображение должно быть закодировано в base64
     *
     * @param base64
     * @throws FiscalizatorException
     */
    void printImage(String base64) throws PrinterException;

    /**
     * Печать штрихкода
     *
     * @param type  тип штрихкода
     * @param value
     * @throws FiscalizatorException
     */
    void printBarcode(BarcodeType type, String value) throws PrinterException;

    /**
     * Отрезка чека
     *
     * @throws FiscalizatorException
     */
    void cut() throws PrinterException;

    /**
     * Флаг отсутствия бумаги
     *
     * @return
     * @throws FiscalizatorException
     */
    boolean isPaperOver() throws PrinterException;

    /**
     * Получение ширины чековой ленты
     *
     * @return
     * @throws FiscalizatorException
     */
    int getCheckWidth(FontSize fontSize) throws PrinterException;

    /**
     * Получение серийного номера ККТ
     *
     * @return
     * @throws FiscalizatorException
     */
    String getSerialNumber() throws PrinterException;

}

package com.dooglys.api.dooglysconnectapi.devices.printer;

/**
 * Created by aldom on 06.07.2018.
 */
public interface HTMLPrinter {

    /**
     * Печать HTML страницы на чеке
     * @param html
     * @throws PrinterException
     */
    void printHTMLpage(String html) throws PrinterException;

}

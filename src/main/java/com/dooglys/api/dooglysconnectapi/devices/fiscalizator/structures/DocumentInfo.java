package com.dooglys.api.dooglysconnectapi.devices.fiscalizator.structures;

import java.util.Date;

/**
 * Created by aldom on 17.08.2018.
 */
public class DocumentInfo {

    private Date dateTime;
    private int number;
    private String fiscalProperty;

    public DocumentInfo(Date dateTime, int number, String fiscalProperty) {
        this.dateTime = dateTime;
        this.number = number;
        this.fiscalProperty = fiscalProperty;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getNumber() {
        return number;
    }

    public String getFiscalProperty() {
        return fiscalProperty;
    }

}

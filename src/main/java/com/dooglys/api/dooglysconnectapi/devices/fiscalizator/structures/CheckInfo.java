package com.dooglys.api.dooglysconnectapi.devices.fiscalizator.structures;

import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.types.CheckType;

import java.util.Date;

/**
 * Created by aldom on 17.08.2018.
 */
public class CheckInfo {

    private Date dateTime;
    private double summ;
    private int number;
    private String fiscalProperty;
    private CheckType type;

    public CheckInfo(Date dateTime, double summ, int number, String fiscalProperty, CheckType type) {
        this.dateTime = dateTime;
        this.summ = summ;
        this.number = number;
        this.fiscalProperty = fiscalProperty;
        this.type = type;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public double getSumm() {
        return summ;
    }

    public int getNumber() {
        return number;
    }

    public String getFiscalProperty() {
        return fiscalProperty;
    }

    public CheckType getType() {
        return type;
    }

    public String getQR() {
        return null;
    }

}

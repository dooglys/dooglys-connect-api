package com.dooglys.api.dooglysconnectapi.devices.fiscalizator.structures;

import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.types.CorrectionCheckType;
import com.dooglys.api.dooglysconnectapi.devices.fiscalizator.types.CorrectionType;

import java.util.Date;

/**
 * Created by aldom on 18.08.2018.
 */
public class CorrectionCheckParameters {

    private CorrectionCheckType correctionCheckType;
    private CorrectionType correctionType;
    private String docNum;
    private String docName;
    private Date docDate;
    private double cash;
    private double card;
    private double advance;
    private double credit;
    private double provision;
    private double sumVatNo;
    private double sumVat0;
    private double sumVat10;
    private double sumVat18;
    private double sumVat110;
    private double sumVat118;

    public CorrectionCheckParameters(CorrectionCheckType correctionCheckType, CorrectionType correctionType, String docNum, String docName, Date docDate, double cash, double card, double advance, double credit, double provision, double sumVatNo, double sumVat0, double sumVat10, double sumVat18, double sumVat110, double sumVat118) {
        this.correctionCheckType = correctionCheckType;
        this.correctionType = correctionType;
        this.docNum = docNum;
        this.docName = docName;
        this.docDate = docDate;
        this.cash = cash;
        this.card = card;
        this.advance = advance;
        this.credit = credit;
        this.provision = provision;
        this.sumVatNo = sumVatNo;
        this.sumVat0 = sumVat0;
        this.sumVat10 = sumVat10;
        this.sumVat18 = sumVat18;
        this.sumVat110 = sumVat110;
        this.sumVat118 = sumVat118;
    }

    public CorrectionCheckType getCorrectionCheckType() {
        return correctionCheckType;
    }

    public void setCorrectionCheckType(CorrectionCheckType correctionCheckType) {
        this.correctionCheckType = correctionCheckType;
    }

    public CorrectionType getCorrectionType() {
        return correctionType;
    }

    public void setCorrectionType(CorrectionType correctionType) {
        this.correctionType = correctionType;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }

    public double getSumVatNo() {
        return sumVatNo;
    }

    public void setSumVatNo(double sumVatNo) {
        this.sumVatNo = sumVatNo;
    }

    public double getSumVat0() {
        return sumVat0;
    }

    public void setSumVat0(double sumVat0) {
        this.sumVat0 = sumVat0;
    }

    public double getSumVat10() {
        return sumVat10;
    }

    public void setSumVat10(double sumVat10) {
        this.sumVat10 = sumVat10;
    }

    public double getSumVat18() {
        return sumVat18;
    }

    public void setSumVat18(double sumVat18) {
        this.sumVat18 = sumVat18;
    }

    public double getSumVat110() {
        return sumVat110;
    }

    public void setSumVat110(double sumVat110) {
        this.sumVat110 = sumVat110;
    }

    public double getSumVat118() {
        return sumVat118;
    }

    public void setSumVat118(double sumVat118) {
        this.sumVat118 = sumVat118;
    }

}

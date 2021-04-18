package com.example.gstinsearch;

import java.io.Serializable;

public class Model implements Serializable {

    private String gstin, legalName, businessName, location, PAN, stateCode, status, regType, complianceStatus;

    public Model(String gstin, String legalName, String businessName, String location, String PAN, String stateCode, String status, String regType, String complianceStatus) {
        this.gstin = gstin;
        this.legalName = legalName;
        this.businessName = businessName;
        this.location = location;
        this.PAN = PAN;
        this.stateCode = stateCode;
        this.status = status;
        this.regType = regType;
        this.complianceStatus = complianceStatus;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }
}

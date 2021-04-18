
package com.example.gstinsearch.Data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("rgdt")
    @Expose
    private String rgdt;
    @SerializedName("ctj")
    @Expose
    private String ctj;
    @SerializedName("frequencyType")
    @Expose
    private Object frequencyType;
    @SerializedName("tradeNam")
    @Expose
    private String tradeNam;
    @SerializedName("errorMsg")
    @Expose
    private Object errorMsg;
    @SerializedName("stj")
    @Expose
    private String stj;
    @SerializedName("lstupdt")
    @Expose
    private String lstupdt;
    @SerializedName("pradr")
    @Expose
    private Pradr pradr;
    @SerializedName("adadr")
    @Expose
    private List<Object> adadr = null;
    @SerializedName("cxdt")
    @Expose
    private String cxdt;
    @SerializedName("lgnm")
    @Expose
    private String lgnm;
    @SerializedName("dty")
    @Expose
    private String dty;
    @SerializedName("nba")
    @Expose
    private List<String> nba = null;
    @SerializedName("ctb")
    @Expose
    private String ctb;
    @SerializedName("stjCd")
    @Expose
    private String stjCd;
    @SerializedName("ctjCd")
    @Expose
    private String ctjCd;
    @SerializedName("sts")
    @Expose
    private String sts;
    @SerializedName("gstin")
    @Expose
    private String gstin;

    public String getRgdt() {
        return rgdt;
    }

    public void setRgdt(String rgdt) {
        this.rgdt = rgdt;
    }

    public String getCtj() {
        return ctj;
    }

    public void setCtj(String ctj) {
        this.ctj = ctj;
    }

    public Object getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(Object frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String getTradeNam() {
        return tradeNam;
    }

    public void setTradeNam(String tradeNam) {
        this.tradeNam = tradeNam;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getStj() {
        return stj;
    }

    public void setStj(String stj) {
        this.stj = stj;
    }

    public String getLstupdt() {
        return lstupdt;
    }

    public void setLstupdt(String lstupdt) {
        this.lstupdt = lstupdt;
    }

    public Pradr getPradr() {
        return pradr;
    }

    public void setPradr(Pradr pradr) {
        this.pradr = pradr;
    }

    public List<Object> getAdadr() {
        return adadr;
    }

    public void setAdadr(List<Object> adadr) {
        this.adadr = adadr;
    }

    public String getCxdt() {
        return cxdt;
    }

    public void setCxdt(String cxdt) {
        this.cxdt = cxdt;
    }

    public String getLgnm() {
        return lgnm;
    }

    public void setLgnm(String lgnm) {
        this.lgnm = lgnm;
    }

    public String getDty() {
        return dty;
    }

    public void setDty(String dty) {
        this.dty = dty;
    }

    public List<String> getNba() {
        return nba;
    }

    public void setNba(List<String> nba) {
        this.nba = nba;
    }

    public String getCtb() {
        return ctb;
    }

    public void setCtb(String ctb) {
        this.ctb = ctb;
    }

    public String getStjCd() {
        return stjCd;
    }

    public void setStjCd(String stjCd) {
        this.stjCd = stjCd;
    }

    public String getCtjCd() {
        return ctjCd;
    }

    public void setCtjCd(String ctjCd) {
        this.ctjCd = ctjCd;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

}

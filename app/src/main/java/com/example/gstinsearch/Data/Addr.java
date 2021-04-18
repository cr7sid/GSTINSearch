
package com.example.gstinsearch.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Addr {

    @SerializedName("lg")
    @Expose
    private String lg;
    @SerializedName("flno")
    @Expose
    private String flno;
    @SerializedName("bno")
    @Expose
    private String bno;
    @SerializedName("pncd")
    @Expose
    private String pncd;
    @SerializedName("st")
    @Expose
    private String st;
    @SerializedName("loc")
    @Expose
    private String loc;
    @SerializedName("lt")
    @Expose
    private String lt;
    @SerializedName("bnm")
    @Expose
    private String bnm;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("dst")
    @Expose
    private String dst;
    @SerializedName("stcd")
    @Expose
    private String stcd;

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getFlno() {
        return flno;
    }

    public void setFlno(String flno) {
        this.flno = flno;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getPncd() {
        return pncd;
    }

    public void setPncd(String pncd) {
        this.pncd = pncd;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getBnm() {
        return bnm;
    }

    public void setBnm(String bnm) {
        this.bnm = bnm;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

}

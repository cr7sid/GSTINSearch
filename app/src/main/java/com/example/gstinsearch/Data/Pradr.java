
package com.example.gstinsearch.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pradr {

    @SerializedName("addr")
    @Expose
    private Addr addr;
    @SerializedName("ntr")
    @Expose
    private String ntr;

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    public String getNtr() {
        return ntr;
    }

    public void setNtr(String ntr) {
        this.ntr = ntr;
    }

}

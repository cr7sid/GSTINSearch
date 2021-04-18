
package com.example.gstinsearch.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIData {

    @SerializedName("flag")
    @Expose
    private Boolean flag;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

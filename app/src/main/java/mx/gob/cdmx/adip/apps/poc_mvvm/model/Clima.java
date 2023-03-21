package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clima {

    @SerializedName("temp_c")
    @Expose
    private Integer tempC;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("ico")
    @Expose
    private String ico;
    @SerializedName("msj_ico")
    @Expose
    private String msjIco;
    @SerializedName("uv")
    @Expose
    private Integer uv;
    @SerializedName("calidad_aire")
    @Expose
    private String calidadAire;

    public Integer getTempC() {
        return tempC;
    }

    public void setTempC(Integer tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getMsjIco() {
        return msjIco;
    }

    public void setMsjIco(String msjIco) {
        this.msjIco = msjIco;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public String getCalidadAire() {
        return calidadAire;
    }

    public void setCalidadAire(String calidadAire) {
        this.calidadAire = calidadAire;

    }
}


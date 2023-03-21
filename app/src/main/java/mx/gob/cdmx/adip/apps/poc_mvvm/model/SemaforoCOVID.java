package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SemaforoCOVID {

    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("hex")
    @Expose
    private String hex;
    @SerializedName("id_color")
    @Expose
    private Integer idColor;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

}

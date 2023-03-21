package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hnc__1 {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("color_hex")
    @Expose
    private String colorHex;
    @SerializedName("terminaciones")
    @Expose
    private String terminaciones;
    @SerializedName("hologramas")
    @Expose
    private String hologramas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public String getTerminaciones() {
        return terminaciones;
    }

    public void setTerminaciones(String terminaciones) {
        this.terminaciones = terminaciones;
    }

    public String getHologramas() {
        return hologramas;
    }

    public void setHologramas(String hologramas) {
        this.hologramas = hologramas;
    }

}

package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HncF {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("color_hex")
    @Expose
    private String colorHex;
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

    public String getHologramas() {
        return hologramas;
    }

    public void setHologramas(String hologramas) {
        this.hologramas = hologramas;
    }
}

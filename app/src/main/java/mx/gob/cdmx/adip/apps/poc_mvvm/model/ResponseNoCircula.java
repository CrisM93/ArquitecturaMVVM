package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseNoCircula {

    @SerializedName("hnc")
    @Expose
    private Hnc hnc;
    @SerializedName("verificacion")
    @Expose
    private List<Verificacion> verificacion = null;
    @SerializedName("SemaforoCOVID")
    @Expose
    private SemaforoCOVID semaforoCOVID;
    @SerializedName("clima")
    @Expose
    private Clima clima;
    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("z_r")
    @Expose
    private Boolean zR;

    public Hnc getHnc() {
        return hnc;
    }

    public void setHnc(Hnc hnc) {
        this.hnc = hnc;
    }

    public List<Verificacion> getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(List<Verificacion> verificacion) {
        this.verificacion = verificacion;
    }

    public SemaforoCOVID getSemaforoCOVID() {
        return semaforoCOVID;
    }

    public void setSemaforoCOVID(SemaforoCOVID semaforoCOVID) {
        this.semaforoCOVID = semaforoCOVID;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Boolean getzR() {
        return zR;
    }

    public void setzR(Boolean zR) {
        this.zR = zR;
    }
}

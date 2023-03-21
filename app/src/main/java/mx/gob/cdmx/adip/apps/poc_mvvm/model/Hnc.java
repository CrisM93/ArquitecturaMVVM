package mx.gob.cdmx.adip.apps.poc_mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hnc {

    @SerializedName("hnc_s")
    @Expose
    private List<Hnc__1> hncS = null;
    @SerializedName("hnc_f")
    @Expose
    private List<HncF> hncF = null;

    public List<Hnc__1> getHncS() {
        return hncS;
    }

    public void setHncS(List<Hnc__1> hncS) {
        this.hncS = hncS;
    }

    public List<HncF> getHncF() {
        return hncF;
    }

    public void setHncF(List<HncF> hncF) {
        this.hncF = hncF;
    }

}

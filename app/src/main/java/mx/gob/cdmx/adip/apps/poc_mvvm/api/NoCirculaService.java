package mx.gob.cdmx.adip.apps.poc_mvvm.api;

import mx.gob.cdmx.adip.apps.poc_mvvm.model.ResponseNoCirculaApi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NoCirculaService {

    @GET("NoCircula")
    Call<ResponseNoCirculaApi> getNoCircula(
            @Query("idioma") String idioma,
            @Query("token") String token
    );
}

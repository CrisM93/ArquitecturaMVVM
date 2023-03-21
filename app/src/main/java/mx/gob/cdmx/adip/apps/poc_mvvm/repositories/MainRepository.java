package mx.gob.cdmx.adip.apps.poc_mvvm.repositories;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import mx.gob.cdmx.adip.apps.poc_mvvm.BuildConfig;
import mx.gob.cdmx.adip.apps.poc_mvvm.api.NoCirculaService;
import mx.gob.cdmx.adip.apps.poc_mvvm.model.ResponseNoCirculaApi;

import androidx.lifecycle.LiveData;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainRepository {

    private static final String BASE_URL_NO_CIRCULA = "http://api-dev.cdmx.gob.mx/index.php/v1/";
    private Context context;
    private NoCirculaService noCirculaService;//Interfaz
    private MutableLiveData<ResponseNoCirculaApi> dashboardMutableLiveData;

    public MainRepository(Context context) {
        this.context = context;
        this.dashboardMutableLiveData = new MutableLiveData<>();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.level(HttpLoggingInterceptor.Level.BODY);
        }
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(15, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build();

        this.noCirculaService = new Retrofit.Builder()
                .baseUrl(BASE_URL_NO_CIRCULA)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NoCirculaService.class);

        init();
    }

    private void init() {

        noCirculaService.getNoCircula(
                "es",
                "1234"
        ).enqueue(new Callback<ResponseNoCirculaApi>() {
            @Override
            public void onResponse(Call<ResponseNoCirculaApi> call, Response<ResponseNoCirculaApi> response) {
                  if(response.isSuccessful()){
                     dashboardMutableLiveData.postValue(response.body());

                  }else{
                      ResponseNoCirculaApi responseNoCirculaApi=new ResponseNoCirculaApi();
                      responseNoCirculaApi.setT(new Exception());
                      dashboardMutableLiveData.postValue(responseNoCirculaApi);

                  }
            }

            @Override
            public void onFailure(Call<ResponseNoCirculaApi> call, Throwable t) {
                ResponseNoCirculaApi responseNoCirculaApi=new ResponseNoCirculaApi();
                responseNoCirculaApi.setT(t);
                dashboardMutableLiveData.postValue(responseNoCirculaApi);

            }
        });

    }

    public LiveData<ResponseNoCirculaApi> getDashboardLiveData() {
        return this.dashboardMutableLiveData;
    }


}

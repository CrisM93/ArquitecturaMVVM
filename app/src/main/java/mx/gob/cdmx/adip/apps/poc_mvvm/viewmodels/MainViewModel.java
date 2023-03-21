package mx.gob.cdmx.adip.apps.poc_mvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import mx.gob.cdmx.adip.apps.poc_mvvm.model.ResponseNoCirculaApi;
import mx.gob.cdmx.adip.apps.poc_mvvm.repositories.MainRepository;

public class MainViewModel extends AndroidViewModel {
    private MainRepository repository;
    private LiveData<ResponseNoCirculaApi> dashboardLiveData;

    public MainViewModel(@NonNull Application application) {
        super(application);
        this.repository=new MainRepository(application);
        this.dashboardLiveData=this.repository.getDashboardLiveData();

    }
    public LiveData<ResponseNoCirculaApi> getDashboardLiveData(){
        return this.dashboardLiveData;
    }
}

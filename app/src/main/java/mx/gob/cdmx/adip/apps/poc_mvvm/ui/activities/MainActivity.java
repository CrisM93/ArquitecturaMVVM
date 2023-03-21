package mx.gob.cdmx.adip.apps.poc_mvvm.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mx.gob.cdmx.adip.apps.poc_mvvm.R;
import mx.gob.cdmx.adip.apps.poc_mvvm.model.ResponseNoCircula;
import mx.gob.cdmx.adip.apps.poc_mvvm.model.ResponseNoCirculaApi;
import mx.gob.cdmx.adip.apps.poc_mvvm.viewmodels.MainViewModel;


import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import android.util.Log;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.gson.Gson;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    private TextView tvResponse;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResponse = findViewById(R.id.textview);

        viewModel = new ViewModelProvider(this)
                .get(MainViewModel.class);

        viewModel.getDashboardLiveData().observe(this, new Observer<ResponseNoCirculaApi>() {
            @Override
            public void onChanged(ResponseNoCirculaApi responseNoCirculaApi) {
                if (responseNoCirculaApi != null) {
                    if (responseNoCirculaApi.getT() != null) {
                        String message;
                        if (responseNoCirculaApi.getT() instanceof IOException) {
                            message = "Revisa tu conexion a Internet";
                        } else {
                            message = "No se pudo establecer conexión";
                        }
                        new MaterialAlertDialogBuilder(MainActivity.this)
                                .setMessage(message)
                                .setPositiveButton("Aceptar", null)
                                .show();

                    } else {
                        if (responseNoCirculaApi.getCode() == 200) {
                            String message2 = String.valueOf(responseNoCirculaApi);
                            tvResponse.setText(new Gson().toJson(responseNoCirculaApi.getResponse().getSemaforoCOVID().getFecha()));
                            setupDashboard(responseNoCirculaApi.getResponse());


                        } else {
                            new MaterialAlertDialogBuilder(MainActivity.this)
                                    .setMessage(responseNoCirculaApi.getMessage())
                                    .setPositiveButton("Aceptar", null)
                                    .show();
                        }
                    }
                }
            }
        });

    }

    private void setupDashboard(ResponseNoCircula response) {
        Log.d("dashboard", new Gson().toJson(response));

    }
}
package com.example.kevin.daggerretofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    @Inject
    Retrofit retrofit;
    EditText deviceId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication)getApplication()).getPushComponent().inject(this);
    deviceId=findViewById(R.id.deviceid);
    }


    public void fuck(View view) {
        //retrofit.create()

        ApiInterface apiInterface=retrofit.create(ApiInterface.class);
        Call<BasePojo> call=apiInterface.push(deviceId.getText().toString());
        call.enqueue(new Callback<BasePojo>() {
            @Override
            public void onResponse(Call<BasePojo> call, Response<BasePojo> response) {
                Toast.makeText(MainActivity.this,response.body().getMessage(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<BasePojo> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();


            }
        });
    }
}

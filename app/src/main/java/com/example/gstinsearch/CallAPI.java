package com.example.gstinsearch;

import com.example.gstinsearch.Data.APIData;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class CallAPI {

    private static final String key = "db73193f0cf2e12f0544bdefffc9679b";
    private static final String url = "https://sheet.gstincheck.ml/check/" + key + "/";

    public static CallService callService = null;

    public static CallService getService() {

        if(callService == null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            callService = retrofit.create(CallService.class);

        }

        return callService;

    }

    public interface CallService {

        @GET("{gst}")
        Call<APIData> getData(@Path("gst") String gstNum);

    }

}

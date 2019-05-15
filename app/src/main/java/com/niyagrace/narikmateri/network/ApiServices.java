package com.niyagrace.narikmateri.network;

import com.niyagrace.narikmateri.response.ResponseMateri;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiServices {
    //@TIPEMETHOD("API_END_POINT")
    @GET("materi.php")
    Call<ResponseMateri> request_show_all_materi();
    // <ModelData> nama_method()
}

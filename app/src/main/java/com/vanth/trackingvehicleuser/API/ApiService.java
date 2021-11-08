package com.vanth.trackingvehicleuser.API;

import com.vanth.trackingvehicleuser.Entity.Account;
import com.vanth.trackingvehicleuser.Request.RegistAccountRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    // Request for login
    @POST("login")
    Call<Boolean> sign_in(@Body Account account);

    // Request for regist
    @POST("regist")
    Call<String> registAccount(@Body RegistAccountRequest registAccountRequest);
}

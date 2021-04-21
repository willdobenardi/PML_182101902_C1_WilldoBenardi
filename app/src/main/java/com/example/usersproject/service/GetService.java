package com.example.usersproject.service;

import java.util.List;

import com.example.usersproject.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}

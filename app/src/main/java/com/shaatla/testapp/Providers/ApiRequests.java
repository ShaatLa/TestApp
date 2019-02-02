package com.shaatla.testapp.Providers;

import com.shaatla.testapp.Models.ServerResponce;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * ApiRequests
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public interface ApiRequests {

    @GET("metric.json")
    Observable<ServerResponce> getJson();
}

package com.shaatla.testapp.Providers;

import android.content.Context;

import com.shaatla.testapp.Models.ServerResponce;

import java.util.List;

import io.reactivex.Observable;

/**
 * ServerConnectionProvider
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public class ServerConnectionProvider {

    public ServerConnectionProvider() {
    }

    public Observable<ServerResponce> getJson() {
        return RestApiAdapter.getInstance().getApiRequests().getJson();
    }
}

package com.shaatla.testapp.Providers;

import android.content.Context;

import com.shaatla.testapp.Models.ServerResponce;

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

    private Context context;

    public ServerConnectionProvider(Context context) {
        this.context = context;
    }

    public Observable<ServerResponce> getJson() {
        return RestApiAdapter.getInstance().getApiRequests().getJson();
    }
}

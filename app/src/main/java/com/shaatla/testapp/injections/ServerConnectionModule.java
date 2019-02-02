package com.shaatla.testapp.injections;

import android.content.Context;

import com.shaatla.testapp.Providers.ServerConnectionProvider;
import com.shaatla.testapp.interactros.PersonalDataInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * ServerConnectionModule
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */

@Module
public class ServerConnectionModule {

    @Provides
    ServerConnectionProvider getServerConnectionProvider() {
        return new ServerConnectionProvider();
    }
}

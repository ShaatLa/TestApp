package com.shaatla.testapp.injections;

import com.shaatla.testapp.MainActivity;

import dagger.Component;
import dagger.Provides;

/**
 * MainActivityComponent
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
@Component(modules = ServerConnectionModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}

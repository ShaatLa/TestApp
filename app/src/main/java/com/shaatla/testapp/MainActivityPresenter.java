package com.shaatla.testapp;

import android.app.Activity;
import android.content.Context;

import com.shaatla.testapp.Models.PersonalData;
import com.shaatla.testapp.Models.ServerResponce;
import com.shaatla.testapp.interactros.PersonalDataInteractor;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/**
 * MainActivityPresenter
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public class MainActivityPresenter {

    PersonalDataInteractor personalDataInteractor;

    @Inject
    public MainActivityPresenter() {
    }

    public void getData() {
        personalDataInteractor.execute();
    }
}

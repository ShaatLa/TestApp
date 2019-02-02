package com.shaatla.testapp.interactros;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.shaatla.testapp.MainActivity;
import com.shaatla.testapp.Models.PersonalData;
import com.shaatla.testapp.Models.ServerResponce;
import com.shaatla.testapp.Providers.ServerConnectionProvider;
import com.shaatla.testapp.injections.ServerConnectionModule;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * PersonalDataInteractor
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */

public class PersonalDataInteractor {

    PersonalData personalData;

    public void execute() {
        Observable<ServerResponce> result = new ServerConnectionProvider().getJson();
        result.subscribe(new Observer<ServerResponce>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("\nSubscribed\n");
            }

            @Override
            public void onNext(ServerResponce serverResponce) {
                personalData = serverResponce.getPersonalData().get(0);
                sendData();
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("\nError\n");
            }

            @Override
            public void onComplete() {
                System.out.println("\nComplete\n");
            }
        });
    }

    private void sendData() {
        showData(personalData);
    }
}

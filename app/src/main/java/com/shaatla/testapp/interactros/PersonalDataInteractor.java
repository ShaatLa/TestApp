package com.shaatla.testapp.interactros;

import com.shaatla.testapp.Models.ServerResponce;
import javax.inject.Inject;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * PersonalDataInteractor
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public class PersonalDataInteractor<ResultType, ParameterType> {

    @Inject
    public PersonalDataInteractor() {
    }

    private final CompositeDisposable disposables = new CompositeDisposable();

    public void execute(Observable<ServerResponce> observable) {
        disposables.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(Observer<ServerResponce>.onNext();));
    }
}

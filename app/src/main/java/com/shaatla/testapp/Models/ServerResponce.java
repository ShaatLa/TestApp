package com.shaatla.testapp.Models;

/**
 * ServerResponce
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public class ServerResponce {

    private PersonalData personalData;

    public ServerResponce(PersonalData personalData) {
        this.personalData = personalData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}

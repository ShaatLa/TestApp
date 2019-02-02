package com.shaatla.testapp.Models;

import java.util.List;

/**
 * ServerResponce
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */
public class ServerResponce {

    private List<PersonalData> personalData;

    public ServerResponce(List<PersonalData> personalData) {
        this.personalData = personalData;
    }

    public List<PersonalData> getPersonalData() {
        return personalData;
    }
}

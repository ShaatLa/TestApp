package com.shaatla.testapp.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * PersonalData
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */

@Entity(tableName = "personalData")
public class PersonalData {

    int aerobic;
    @PrimaryKey
    @NonNull
    int date;
    int run;
    int walk;

    public PersonalData(int aerobic, int date, int run, int walk) {
        this.aerobic = aerobic;
        this.date = date;
        this.run = run;
        this.walk = walk;
    }

    public int getAerobic() {
        return aerobic;
    }

    public int getDate() {
        return date;
    }

    public int getRun() {
        return run;
    }

    public int getWalk() {
        return walk;
    }
}

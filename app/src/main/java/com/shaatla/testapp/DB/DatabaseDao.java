package com.shaatla.testapp.DB;

import com.shaatla.testapp.Models.PersonalData;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

/**
 * DatabaseDao
 * v.1.0
 * 01.02.2019
 * Created by Dmitry Mochalov
 * dmitry.mochalov@auriga.com
 * Copyright (c) 2019 Auriga Inc. All rights reserved.
 */

@Dao
public interface DatabaseDao {

    @Query("SELECT * from personalData")
    List<PersonalData> getAll();

    @Query("SELECT * from personalData WHERE date = :date")
    PersonalData getByDate(int date);

    @Insert
    void insert(PersonalData personalData);

    @Update
    void update(PersonalData personalData);

    @Delete
    void delete(PersonalData personalData);

}

package com.johapps.tipcalc.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Johnny Téllez on 03/11/2016.
 */

@Database(name= TipDatabase.NAME, version = TipDatabase.VERSION)
public class TipDatabase {
    public static final String NAME = "Tips";
    public static final int VERSION = 1;
}

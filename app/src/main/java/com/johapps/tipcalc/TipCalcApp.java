package com.johapps.tipcalc;

import android.app.Application;
/**
 * Created by Johnny Téllez on 09/10/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "http://juancrg90.me";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}

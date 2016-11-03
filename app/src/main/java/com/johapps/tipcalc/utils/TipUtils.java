package com.johapps.tipcalc.utils;

import com.johapps.tipcalc.entity.TipRecord;

import java.text.SimpleDateFormat;

/**
 * Created by Johnny Téllez on 03/11/2016.
 */
public class TipUtils {
    public static double getTip(TipRecord tipRecord) {
        return tipRecord.getBill()*(tipRecord.getTipPercentage()/100d);
    }

    public static String getDateFormated(TipRecord tipRecord){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(tipRecord.getTimestamp());
}

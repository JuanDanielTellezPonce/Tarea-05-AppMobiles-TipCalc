package com.johapps.tipcalc.fragments;

import com.johapps.tipcalc.models.TipRecord;

/**
 * Created by Johnny Téllez on 10/10/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}

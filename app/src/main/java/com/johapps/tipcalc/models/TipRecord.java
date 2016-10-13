package com.johapps.tipcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Johnny Téllez on 13/10/2016.
 */
public class TipRecord {
    private double bill;
    private int tipPrecentage;
    private Date timestap;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPrecentage() {
        return tipPrecentage;
    }

    public void setTipPrecentage(int tipPrecentage) {
        this.tipPrecentage = tipPrecentage;
    }

    public Date getTimestap() {
        return timestap;
    }

    public void setTimestap(Date timestap) {
        this.timestap = timestap;
    }

    public double getTip() {
        return bill * (tipPrecentage/100d);
    }

    public String getDateFormated() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(timestap);
    }
}

package com.johapps.tipcalc.entity;

import com.johapps.tipcalc.db.TipDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Johnny Téllez on 13/10/2016.
 */

@Table(database = TipDatabase.class)
public class TipRecord extends BaseModel{

    @PrimaryKey(autoincrement = true)
    private int id;
    @Column
    private double bill;
    @Column
    private Date timestamp;
    @Column
    private int tipPercentage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public double getTip() {
        return bill*(tipPercentage/100d);
    }

   /* public String getDateFormated(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timestamp);*/
    }

